#!/bin/bash

echo "Atualizando o servidor."
apt-get update
apt-get upgrade -y

echo "Instalando o Apache."
apt-get install apache2 -y

echo "Instalando o Unzip."
apt-get install unzip -y

echo "Baixando a Aplicação."
cd /tmp
wget https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip

echo "Extraindo Aplicação."
unzip main.zip

echo "Copiando Aplicação para a pasta WWW."
cd linux-site-dio-main
cp -R * /var/www/html/

echo "Script Finalizado."