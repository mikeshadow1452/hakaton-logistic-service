релиза не будит(((


# Чо юзаем:
### Бек:
На бекенде java, spring.

Ну тут все ясно. Миллиард кайфовых либ для спринга от бд до `подставь свое`. Но тут в этом и проблема, чо от него юзать в целом не понятно. Ну понятно там spring boot, spring security, JPA но хз все ли это. И все еще не уверен как отдавать странички самого сайта, отдельным сервисом или из джавы. ~~Я думаю что надо из джавы, но есть проблемы..~~ Уже нет

### На фронте все еще хуже:
React имба, vite с реактом вообще отвал всего. ~~Но есть проблема что я пока хз можно ли сбилдить фулл странички и потом юзать их отдельно, а не отдельным сервисом. Буду гуглить~~ Уже нет



# Бекенд

### Юзер-покупатель:
- логин (ключ)
- почта
- телефон
- пароль (шифрованный с фронта)
- Корзина 
- массив с историями заказов (заказы тож сущностями)
- логин сессия (ну так, если времени хватит, хых)

### Заказ
- Номер (ключ)
- Дата создания (дейттайм)
- Сумма деняк
- Массив позиций в заказе (хз как делать, думаю хешмапами `товар-колличество в заказе`, но не уверен что оно в постгерс нормальо закинется)
- Статус (enum: не оформлен, в обработке, в доставке, доставлен, отменен)
- Откуда (маппинг в сущность склада)
- Куда (маппинг в сущность пвз)

### Товар
- Номер (ключ)
- Дата создания (дейттайм)
- Цена
- Название
- Продавец (маппинг в юзера-продавца)
- картинка
- описание
- массив с хешмапами `склад-колличество`
- общее колличество (не хранится в базе, генерируется)

### Юзер продавец
- логин (ключ)
- почта
- телефон
- пароль (шифрованный с фронта)
- список товаров (сущностями)
- пвз
- склады

### СКЛАД
Вообще пока пишу так, но там чел говорит типа марштуры от региона к региону, так что задача упрощается (наверное)
- область (хз как вообще)
- массив с хешмапами `товар-колличество`

### хз будет ли пвз отдельно как то

# API эндпоинты
В первую очередь должны для связи фронта и бека

### GET /api/user
Возвращает данные о юзере (без пароля естесственно), см сущность Юзер-покупатель. 
Смотрит по сессии юзера. Если её нет, то возвращает 404 (отображаем что юзер не залогинен)

### GET /products?{filter}
страница товаров с фильтром

### /product?{id}
страница товара

### GET /api/products?{filter}&{offset}&{amount}
Возвращает товары в json виде (структура в сущности товара)
`filter` фильтр для поиска, можно не указывать, что бы запросить все товары
`offset` смещение, т.е. с какого товара запросить, можно не указывать, по умолчанию 0
`amount` колличество товаров, можно не указывать по умолчанию 30

### POST /api/appendToCart?{id}&{amount}
Добавление товара в корзину

### POST /api/deleteFromCart?{id}
Удаление товара из корзины

### GET /api/cart
Получение корзины по юзер сессии

### GET /cart
Страница с корззиной

### GET /profile
страница профиля. Тут история заказов, настройки пароля, выбор региона



Будет дополнятся.
