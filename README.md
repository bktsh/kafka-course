# kafka-starter
learning kafka

##### Installation on MacOS

~~~~~
brew install kafka 
# bonous
brew cask install kafka-tool
~~~~~

##### zookeeper ==> 
To have launchd start zookeeper now and restart at login:
~~~~~
  brew services start zookeeper
OR, if you don't want/need a background service you can just run:
  zkServer start
~~~~~

##### kafka ==> 
To have launchd start kafka now and restart at login:
~~~~~
  brew services start kafka
OR, if you don't want/need a background service you can just run:
  zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties & kafka-server-start /usr/local/etc/kafka/server.properties
~~~~~  

##### List/Creatw/Describe topics

~~~~~  
  kafka-topics --list --bootstrap-server localhost:9092
  kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test_topic
  kafka-topics --describe --bootstrap-server localhost:9092 --topic test_topic
~~~~~
  
##### Create new producer/consumers (for test_topic) 

~~~~~  
  kafka-console-producer --broker-list localhost:9092 --topic test_topic
  kafka-console-consumer --bootstrap-server localhost:9092 --topic test_topic --from-beginning
~~~~~  



 
