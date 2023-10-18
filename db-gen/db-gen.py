import sqlite3

# 1. Conecta o crea la base de datos (si no existe, se creará)
conexion = sqlite3.connect("url_short.db")

# 2. Crea un objeto cursor para ejecutar comandos SQL
cursor = conexion.cursor()

# 3. Define el comando SQL para crear la tabla "personas"
"""
comando_sql = #
CREATE TABLE t_url (
    id INTEGER PRIMARY KEY,
    url TEXT,
    short TEXT,
    active boolean,
    user_id INTEGER
);

"""
comando_sql = """

INSERT INTO t_url (id, url, short, active) values (1, 'http://prueba.com', 'asd1', true)

"""


# 4. Ejecuta el comando SQL para crear la tabla
cursor.execute(comando_sql)

# 5. Confirma los cambios y cierra la conexión con la base de datos
conexion.commit()
conexion.close()

