USE tacocloud;

TRUNCATE tacos;
TRUNCATE orders;
TRUNCATE ingredients;

INSERT INTO ingredients (id, name, type) VALUES ('FLTO', 'Flour Tortilla', 'WRAP');
INSERT INTO ingredients (id, name, type) VALUES ('COTO', 'Corn Tortilla', 'WRAP');
INSERT INTO ingredients (id, name, type) VALUES ('GRBF', 'Ground Beef', 'PROTEIN');
INSERT INTO ingredients (id, name, type) VALUES ('CARN', 'Carnitas', 'PROTEIN');
INSERT INTO ingredients (id, name, type) VALUES ('TMTO', 'Diced Tomatoes', 'VEGGIES');
INSERT INTO ingredients (id, name, type) VALUES ('LETC', 'Lettuce', 'VEGGIES');
INSERT INTO ingredients (id, name, type) VALUES ('CHED', 'Cheddar', 'CHEESE');
INSERT INTO ingredients (id, name, type) VALUES ('JACK', 'Monterrey Jack', 'CHEESE');
INSERT INTO ingredients (id, name, type) VALUES ('SLSA', 'Salsa', 'SAUCE');
INSERT INTO ingredients (id, name, type) VALUES ('SRCR', 'Sour Cream', 'SAUCE');
