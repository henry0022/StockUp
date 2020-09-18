create database if not exists StockUp_db;
use StockUp_db;

create table if not exists Company (
company_ID int not null auto_increment,
company_Name varchar(45) not null,
company_Address varchar(255) not null,
company_PhoneNumber int(10) not null,
primary key (company_ID)
);

create table if not exists Admins (
admin_ID int not null auto_increment,
admin_Name varchar(45) not null,
admin_Surname varchar(45) not null,
admin_PhoneNumber int(10) not null,
company_ID int not null,
username varchar(45) not null unique,
password varchar(45) not null,
primary key (admin_ID),
foreign key (company_ID) references Company (company_ID)
);

create table if not exists Dispatch (
dispatch_ID int not null auto_increment,
dispatch_Name varchar(45) not null,
dispatch_Surname varchar(45) not null,
dispatch_PhoneNumber int(10) not null,
company_ID int not null,
username varchar(45) not null unique,
password varchar(45) not null,
primary key (dispatch_ID),
foreign key (company_ID) references Company (company_ID)
);

create table if not exists Product (
product_ID int not null auto_increment,
product_Name varchar(45) not null,
product_UnitsPerCrate int not null,
company_ID int not null,
primary key (product_ID),
foreign key (company_ID) references Company (company_ID)
);

create table if not exists Store (
store_ID int not null auto_increment,
store_Name varchar(45) not null,
store_Address varchar(255) not null,
store_PhoneNumber int(10) not null,
primary key (store_ID)
);

create table if not exists Staff (
staff_ID int not null auto_increment,
staff_Name varchar(45) not null,
staff_Surname varchar(45) not null,
staff_PhoneNumber int(10) not null,
store_ID int not null,
username varchar(45) not null unique,
password varchar(45) not null,
primary key (staff_ID),
foreign key (store_ID) references Store (store_ID)
);

create table if not exists Orders (
order_ID int not null auto_increment,
order_Date date not null,
store_ID int not null,
primary key (order_ID),
foreign key (store_ID) references Store (store_ID)
);

create table if not exists OrderDetails (
od_CratesOrdered int not null,
product_ID int not null,
order_ID int not null,
primary key (product_ID, order_ID),
foreign key (product_ID) references Product (product_ID),
foreign key (order_ID) references Orders (order_ID)
);

insert into Company (company_Name, company_Address, company_PhoneNumber)
values	('Elgin Free Range Chickens', 'Industrial Rd, Grabouw 7160', '0218592795');

insert into Admins (admin_Name, admin_Surname, admin_PhoneNumber, company_ID, username, password)
values	('Jim', 'Adams', '0832965736', '001', 'adminOne', 'P@ssword123'),
		('Bob', 'Stevens', '0735992902', '001', 'adminTwo', 'P@ssword123'),
        ('Mandy', 'Shore', '0846863495', '001', 'adminThree', 'P@ssword123');

insert into Dispatch (dispatch_Name, dispatch_Surname, dispatch_PhoneNumber, company_ID, username, password)
values	('Adam', 'Jones', '0842139879', '001', 'dispatchOne', 'P@ssword123'),
		('Eve', 'Stones', '0734672953', '001', 'dispatchTwo', 'P@ssword123'),
        ('John', 'Mecury', '0716623845', '001', 'dispatchThree', 'P@ssword123');

insert into Product (product_Name, product_UnitsPerCrate, company_ID)
values	('WS Breakfast Chipolatas', '6', '001'),
		('WS Breasts - Skin On', '10', '001'),
        ('WS BUDGET B Grade Drumsticks', '10', '001'),
        ('WS BUDGET B Grade Portion Pack', '12', '001'),
        ('WS BUDGET B Grade Skinless BFillets', '16', '001'),
        ('WS BUDGET B Grade Thighs 4', '16', '001'),
        ('WS BUDGET B Grade Wings', '10', '001'),
        ('WS Burger Patties - Crumb Plain', '6', '001'),
        ('WS Butterflied HALF - BBQ', '4', '001'),
        ('WS Butterflied HALF - Peri Peri', '4', '001'),
        ('WS Drums & Thighs', '8', '001'),
        ('WS Drumsticks', '10', '001'),
        ('WS Family Braaipack', '8', '001'),
        ('WS Kebabs - Wings Sweet Chilli Glaze', '6', '001'),
        ('WS Leg Quarters', '12', '001'),
        ('WS Liver tubs 250g', '6', '001'),
        ('WS Meatballs - Herb Crumb', '6', '001'),
        ('WS Mince Chicken', '10', '001'),
        ('WS Mini Fillets', '16', '001'),
        ('WS Portion Pack', '8', '001'),
        ('WS Sausage - Barbeque', '6', '001'),
        ('WS Sausage - Garlic and Herb', '6', '001'),
        ('WS Sausage - Kameeldoring', '6', '001'),
        ('WS Skinless Breast Fillets - 4', '16', '001'),
        ('WS Skinless Breast Fillets - Limited Edition', '12', '001'),
        ('WS Skinless Breast Fillets - Rsmry Lmn & Yog', '12', '001'),
        ('WS Skinless Breast Fillets - Salsa', '12', '001'),
        ('WS Skinless Thigh Fillets - 12', '6', '001'),
        ('WS Skinless Variety', '10', '001'),
        ('WS Sosatie - Sticky BBQ & Pineapple', '6', '001'),
        ('WS Sosatie - Sweet Curry & Peach', '6', '001'),
        ('WS Whole Bird', '6', '001'),
        ('WS Wings - Cocktail Plain', '8', '001'),
        ('WS Wings - Spicy Sticky', '6', '001'),
        ('WS Wings - Hot', '6', '001');

insert into Store (store_Name, store_Address, store_PhoneNumber)
values	('Durbanville', 'Shop 2, Spur Building, 2 Pampoenkraal Ln, Durbanville, Cape Town', '0609970724'),
		('George', 'Unit 1 Value Centre, C/O Market and, Hope St, George', '0823101042'),
        ('Grabouw', 'Industrial Rd, Grabouw, Cape Town', '0796930470'),
        ('Hermanus','Bergsig Business Park, Unit 2, Erf 1599, Bergsig Street, Sandbaai, Hermanus, Cape Town, 7200','0664758649'),
        ('Kenilworth', 'Shop G1, Access Park, Chichester Rd, Claremont, Cape Town','0663014356'),
        ('Montague Gardens','The Expo Building, 35 Stella Cove, Montague Gardens, Cape Town','0729118974'),
        ('Paarl','Shop G107 Rembrandt Mall Cnr Bergriver Boulevard &, Dorp Street, Paarl, Cape Town','0609838417'),
        ('Parklands','Shop 5b, Leonardo Park, Parklands Main Rd, Parklands, Cape Town','0829442636'),
        ('Somerset West','Shop 25A, Somerset Value Mart Centenary Drive, Intersection of N2 and, R44, Somerset West, Cape Town, 7129','0724284528'),
        ('Stellenbosch','6 John Costas Rd, Plankenburg, Stellenbosch','0664804917'),
        ('Tokai','Shop No 333, South Palms Centre, Main Rd, Tokai, Cape Town','0767021830');

insert into Staff (staff_Name, staff_Surname, staff_PhoneNumber, store_ID, username, password)
values	('James', 'Jameson', '0831252543', '002', 'staffOne', 'P@ssword123'),
		('Mary', 'Scarlet', '0847285377', '001', 'staffTwo', 'P@ssword123'),
        ('Amy', 'Hendricks', '0712993475', '003', 'staffThree', 'P@ssword123');

insert into Orders (order_Date, store_ID)
values	('2017-07-30', '003'),
		('2017-10-27', '001'),
        ('2018-06-17', '003'),
        ('2019-04-25', '002'),
        ('2019-12-01', '001'),
		('2020-03-24', '002'),
		('2020-05-13', '001'),
        ('2020-08-02', '003');

insert into OrderDetails (od_CratesOrdered, product_ID, order_ID)
values	('10', '002', '006'),
		('15', '004', '002'),
        ('21', '003', '005'),
        ('12', '001', '001');