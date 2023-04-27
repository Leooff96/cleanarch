CREATE TABLE "company" (
  "company_name" varchar PRIMARY KEY,
  "city" varchar
);

CREATE TABLE "department" (
  "department_id" varchar PRIMARY KEY,
  "company_name" varchar
);

CREATE TABLE "employee" (
  "employee_id" varchar PRIMARY KEY,
  "employee_name" varchar,
  "street" varchar,
  "city" varchar,
  "sex" varchar,
  "bdate" date
);

CREATE TABLE "products" (
  "product_id" varchar PRIMARY KEY,
  "product_name" varchar
);

CREATE TABLE "purchases" (
  "supplier_name" varchar ,
  "company_name" varchar,
  "purchase_date" timestamp,
  "purchase_cost" decimal,
  "ingredient_name" varchar,
  "ingredient_quantity" int,
  PRIMARY KEY(company_name,supplier_name)
);

CREATE TABLE "retailer" (
  "retailer_name" varchar PRIMARY KEY,
  "retailer_city" varchar
);

CREATE TABLE "sales" (
  "retailer_name" varchar,
  "product_id" varchar,
  "sales_date" timestamp,
  "sales_quantity" int,
  "sales_cost" decimal,
  PRIMARY KEY(product_id,retailer_name)
);

CREATE TABLE "supplier" (
  "supplier_name" varchar PRIMARY KEY,
  "supplier_city" varchar
);

CREATE TABLE "users" (
  "id" varchar(36) PRIMARY KEY,
  "username" varchar,
  "email" varchar,
  "password" varchar
);

ALTER TABLE "department" ADD FOREIGN KEY ("company_name") REFERENCES "company" ("company_name");

ALTER TABLE "purchases" ADD FOREIGN KEY ("supplier_name") REFERENCES "supplier" ("supplier_name");

ALTER TABLE "purchases" ADD FOREIGN KEY ("company_name") REFERENCES "company" ("company_name");

ALTER TABLE "sales" ADD FOREIGN KEY ("retailer_name") REFERENCES "retailer" ("retailer_name");

ALTER TABLE "sales" ADD FOREIGN KEY ("product_id") REFERENCES "products" ("product_id");