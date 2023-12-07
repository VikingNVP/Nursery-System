## Task 1. Использование команды cat в Linux
mkdir Kennel    
cd ~/Kennel    
cat > home_animals    
cat > pack_animals    
cat home_animals pack_animals > all_animals    
cat all_animals    
mv all_animals mans_friends    
ls -al    

## Task 2. Работа с директориями в Linux
cd ..    
mkdir Nursery_System    
cd ~/Kennel    
mv mans_friends ~/Nursery_System    
cd ~/Nursery_System    
ls -al    

## Task 3. Работа с MySQL в Linux
sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb    
sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb    
sudo apt-get update    
sudo apt-get install mysql-server    

## Task 4. Управление deb-пакетами
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb    
sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb    
sudo dpkg -r docker-ce-cli