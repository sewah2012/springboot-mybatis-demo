drop table if exists products;

    create table products (
        productId integer NOT NULL auto_increment primary key,
        productName varchar(255) NOT NULL,
        productDescription varchar(255) NOT NULL,
        quantity integer NOT NULL,
        price float(10) NOT NULL
    );