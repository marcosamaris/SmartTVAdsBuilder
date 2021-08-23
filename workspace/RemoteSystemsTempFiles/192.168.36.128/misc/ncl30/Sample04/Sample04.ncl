<?xml version="1.0" encoding="ISO-8859-1"?>
<ncl id="focus" xmlns="http://www.ncl.org.br/NCL3.0/EDTVProfile"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
xsi:schemaLocation="http://www.ncl.org.br/NCL3.0/EDTVProfile
http://www.ncl.org.br/NCL3.0/profiles/NCL30EDTV.xsd">
<head>

<!--region-->
  <regionBase>
    <region id="mainDevice" width="100%" height="100%">
      <region id="rgV" width="100%" height="100%" zIndex="6"/>
      <region id="rB1" right="10%" top="10%" width="20%" height="7%" zIndex="6"/>
      <region id="rT1" right="5%" top="12%" width="20%" height="6%" zIndex="7"/>	
      <region id="rB2" right="10%" top="20%" width="20%" height="7%" zIndex="6"/>
      <region id="rT2" right="5%" top="22%" width="20%" height="6%" zIndex="7"/>
      <region id="rB3" right="10%" top="30%" width="20%" height="7%" zIndex="6"/>
      <region id="rT3" right="5%" top="32%" width="20%" height="6%" zIndex="7"/>
      <region id="rB4" right="10%" top="40%" width="20%" height="7%" zIndex="6"/>
      <region id="rT4" right="5%" top="42%" width="20%" height="6%" zIndex="7"/>
      <region id="rD"  right="5%" bottom="5%" width="85%" height="25%" zIndex="6"/>
      <region id="rT5"  right="1%" bottom="2%" width="85%" height="25%" zIndex="7"/>
      <region id="rT6"  right="1%" bottom="2%" width="85%" height="25%" zIndex="7"/>
      <region id="rT7"  right="1%" bottom="2%" width="85%" height="25%" zIndex="7"/>
      <region id="rT8"  right="1%" bottom="2%" width="85%" height="25%" zIndex="7"/>
      <region id="rB5"  right="1%" top="1%" width="2%" height="2%" zIndex="7"/>
      <region id="rB6"  right="1%" top="1%" width="2%" height="2%" zIndex="7"/>
      
    </region>
  </regionBase>
  
  
<!--descriptor-->
  <descriptorBase>
  	
  	<descriptor id="dmainDevice" region="mainDevice"/>
  	<descriptor id="dV" region="rgV"/>
        
    <descriptor id="dF" region="rB5"/>

    <descriptor id="dB1" region="rB1"
     focusIndex="1"
     moveUp="4" moveDown="2"/>

    <descriptor id="dB2" region="rB2"
     focusIndex="2"
     moveUp="1" moveDown="3"/>


    <descriptor id="dB3" region="rB3"
     focusIndex="3"
     moveUp="2" moveDown="4"/>


    <descriptor id="dB4" region="rB4"
     focusIndex="4"
     moveUp="3" moveDown="1"/>


    <descriptor id="dT1" region="rT1">
       
    </descriptor>
    
    <descriptor id="dT2" region="rT2"/>   
    <descriptor id="dT3" region="rT3"/>    
    <descriptor id="dT4" region="rT4"/>    
    <descriptor id="dD" region="rD"/>    
    <descriptor id="dT5" region="rT5"/>       
    <descriptor id="dT6" region="rT6"/>       
    <descriptor id="dT7" region="rT7"/>
    <descriptor id="dT8" region="rT8"/>


  </descriptorBase>
  
  
<!--conector-->
  <connectorBase>
    <causalConnector id="onBeginStart">
      <simpleCondition role="onBegin"/>
      <simpleAction role="start" max="unbounded" qualifier="par"/>
    </causalConnector>

      
    <causalConnector id="onSelectionStop">
      	<simpleCondition role="onSelection" key="RED"/>
      <simpleAction role="stop" max="unbounded" qualifier="par"/>
    </causalConnector>

	<causalConnector id="onSelectionStopStart">
		<simpleCondition role="onSelection"/>
		<compoundAction operator="par">
			<simpleAction role="stop" max="unbounded"/>
			<simpleAction role="start" max = "unbounded"/>
		</compoundAction>
	</causalConnector>
	
	<causalConnector id="onSelectionSetStartStop">
		<connectorParam name="var"/>
		<simpleCondition role="onSelection" key="RED"/>
		<compoundAction operator="par">
			<simpleAction role="set" value="$var" max="unbounded" qualifier="par"/>
			<simpleAction role="start" max="unbounded" qualifier="par"/>
			<simpleAction role="stop" max="unbounded" qualifier="par"/>
		</compoundAction>
	</causalConnector>
    
  </connectorBase>

</head>

<body>
	<!--porta-->
  <port id="entrada" component="s"/>
<!--media-->
  <media id="planoFundo" src="img/TELA.jpg"
  descriptor="dmainDevice"/>
  <media descriptor="dV" id="s" src="video/Comercial_Viva_La_Fruta.mp4">
  	<property name="bounds"/>
  </media>
  <media descriptor="dB1" id="b1" src="/misc/ncl30/sample03/img/branco.jpg"/>
  <media descriptor="dB2" id="b2" src="img/branco.jpg"/>
  <media descriptor="dB3" id="b3" src="img/branco.jpg"/>
  <media descriptor="dB4" id="b4" src="img/branco.jpg"/>
  <media descriptor="dF" id="b5" src="img/descbranco.jpg"/>
  <media descriptor="dF" id="b6" src="img/descbranco.jpg"/>
  <media descriptor="dT1" id="t1" src="txt/text1.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="10"/>
    <property name="fontColor" value="black"/>
     </media>
  <media descriptor="dT2" id="t2" src="txt/text2.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="10"/>
    <property name="fontColor" value="black"/>
     </media>    
   <media descriptor="dT3" id="t3" src="txt/text3.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="10"/>
    <property name="fontColor" value="black"/>
     </media>
   <media descriptor="dT4" id="t4" src="txt/text4.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="10"/>
    <property name="fontColor" value="black"/>
     </media>    
   <media descriptor="dT5" id="t5" src="txt/textProd1.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="12"/>
    <property name="fontColor" value="black"/>
     </media>
   <media descriptor="dT6" id="t6" src="txt/textProd2.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="12"/>
    <property name="fontColor" value="black"/>
     </media>     
   <media descriptor="dT7" id="t7" src="txt/textProd3.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="12"/>
    <property name="fontColor" value="black"/>
     </media>    
   <media descriptor="dT8" id="t8" src="txt/textProd4.txt">
    <property name="fontUri"/>
    <property name="fontSize" value="12"/>
    <property name="fontColor" value="black"/>
     </media>   
	<media id="D" descriptor="dD" src="img/branco.jpg"/>
<!--elos-->
  
 <link xconnector="onBeginStart">
 	<bind role="onBegin" component="s"/>
 	<bind role="start" component="b6"/>
 </link>
  
 <link xconnector="onSelectionSetStartStop">
 	<bind role="onSelection" component="b6"/>
 	<bind role="set" component="s" interface="bounds">
 		<bindParam name="var" value="5%, 5%, 60%, 60%"/>	 	
	 </bind>
	<bind role="start" component="planoFundo"/>
    <bind component="b1" role="start"/>
    <bind component="b2" role="start"/>
    <bind component="b3" role="start"/>
    <bind component="b4" role="start"/>
    <bind component="t1" role="start"/>
    <bind component="t2" role="start"/>
    <bind component="t3" role="start"/>
    <bind component="t4" role="start"/>
    <bind component="b5" role="start"/>
    <bind role="start" component="D"/>
    <bind role="stop" component="b6"/>
	 	
 </link>

  <link id="linkTransicaoPraia" xconnector="onSelectionStop">
    <bind component="b5" role="onSelection"/>
    <bind component="s" role="stop"/>
    <bind component="b1" role="stop"/>
    <bind component="b2" role="stop"/>
    <bind component="b3" role="stop"/>
    <bind component="b4" role="stop"/>
    <bind role="stop" component="b5"/>
    <bind component="t1" role="stop"/>
    <bind component="t2" role="stop"/>
    <bind component="t3" role="stop"/>
    <bind component="t4" role="stop"/>
    <bind component="t5" role="stop"/>
    <bind component="t6" role="stop"/>
    <bind component="t7" role="stop"/>
    <bind component="t8" role="stop"/>
    <bind role="stop" component="planoFundo"/>
    <bind role="stop" component="D"/>
  </link>


	<link xconnector="onSelectionStopStart">
		<bind role="onSelection" component="b1"/>
		<bind role="stop" component="t6"/>
		<bind role="stop" component="t7"/>
		<bind role="stop" component="t8"/>
		<bind role="start" component="t5"/>
		
	</link>
	
	<link xconnector="onSelectionStopStart">
		<bind role="onSelection" component="b2"/>
		<bind role="stop" component="t5"/>
		<bind role="stop" component="t7"/>
		<bind role="stop" component="t8"/>
		<bind role="start" component="t6"/>
		
	</link>
	
	<link xconnector="onSelectionStopStart">
		<bind role="onSelection" component="b3"/>
		<bind role="stop" component="t5"/>
		<bind role="stop" component="t6"/>
		<bind role="stop" component="t8"/>
		<bind role="start" component="t7"/>
		
	</link>
	
	<link xconnector="onSelectionStopStart">
		<bind role="onSelection" component="b4"/>
		<bind role="stop" component="t5"/>
		<bind role="stop" component="t6"/>
		<bind role="stop" component="t7"/>
		<bind role="start" component="t8"/>
		
	</link>
	
</body>
</ncl>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
