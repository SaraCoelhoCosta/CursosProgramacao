# Usando _MySQL_ no _Linux_

bind-address = 127.0.0.1 (Endereço anterior do arquivo mysqld.cnf)

1. Instalar MySQL Workbench (Tem no gerenciador de aplicativos).
2. No terminal:

        sudo apt install mysql-server (Para instalar MySQL)
        sudo mysql_secure_installation (Para configurar MySQL)

3. Edite o arquivo mysqld.cnf e mude o 'bind-address' para 0.0.0.0
4. No terminal:

        sudo service mysql restart
        sudo mysql -u root
        ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'MinhaSenha';
