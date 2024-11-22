USE tacocloud;

CREATE TABLE orders (
                        id UUID PRIMARY KEY,
                        placedAt timestamp,
                        deliveryName text,
                        deliveryStreet text,
                        deliveryCity text,
                        deliveryState text,
                        deliveryZip text,
                        ccNumber text,
                        ccExpiration text,
                        ccCVV text,
                        tacos list<uuid>
);

CREATE TABLE taco (
                      id UUID,
                      createAt timestamp,
                      name text,
                      ingredients list<text>,
                      PRIMARY KEY (id, createAt)
) WITH CLUSTERING ORDER BY (createAt DESC);


CREATE TABLE IF NOT EXISTS Ingredient (
                                          id text PRIMARY KEY,
                                          name text,
                                          type text
);
