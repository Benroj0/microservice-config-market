-- Datos para categorías
insert into categoria(nombre) values
('Electrónica'),
('Ropa'),
('Hogar y cocina'),
('Deportes'),
('Libros');

-- Datos para clientes
insert into cliente(nombres, email, password, celular, direccion) values
('Juan Pérez', 'juan.perez@example.com', 'password123', 123456789, 'Calle Ficticia 123'),
('Ana Gómez', 'ana.gomez@example.com', 'password456', 987654321, 'Avenida Ejemplo 456');

-- Datos para productos
insert into producto(nombre, descripcion, imagen, cantidad, precio) values
('Smartphone', 'Último modelo de smartphone de alta calidad', 'smartphone.jpg', 50, 799),
('Camiseta', 'Camiseta de algodón cómoda', 'camiseta.jpg', 200, 19),
('Licuadora', 'Licuadora de alta potencia para cocina', 'licuadora.jpg', 30, 59),
('Balón de fútbol', 'Balón de fútbol durable para práctica', 'balon.jpg', 100, 24),
('Libro de aventura', 'Un emocionante libro de aventuras', 'libro.jpg', 150, 9);

-- Datos para pedidos
insert into pedido(cliente_id, fecha_pedido, estado) values
(1, '2025-04-01', 'Enviado'),
(2, '2025-04-02', 'Pendiente');

-- Datos para detalles de pedidos
insert into detalle_pedido(pedido_id, producto_id, cantidad, precio_total) values
(1, 1, 1, 799),
(1, 2, 2, 39),
(2, 3, 1, 59);
