
package pokerth_protocol;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "StartEventMessage" )
    public class StartEventMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "StartEventMessage" , isSet = false )
       public static class StartEventMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "gameId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId gameId = null;
                
  
        
    @ASN1PreparedElement
    @ASN1Choice ( name = "startEventType" )
    public static class StartEventTypeChoiceType implements IASN1PreparedElement {
            
        @ASN1Element ( name = "startEvent", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private StartEvent startEvent = null;
                
  
        @ASN1Element ( name = "rejoinEvent", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private RejoinEvent rejoinEvent = null;
                
  
        
        public StartEvent getStartEvent () {
            return this.startEvent;
        }

        public boolean isStartEventSelected () {
            return this.startEvent != null;
        }

        private void setStartEvent (StartEvent value) {
            this.startEvent = value;
        }

        
        public void selectStartEvent (StartEvent value) {
            this.startEvent = value;
            
                    setRejoinEvent(null);
                            
        }

        
  
        
        public RejoinEvent getRejoinEvent () {
            return this.rejoinEvent;
        }

        public boolean isRejoinEventSelected () {
            return this.rejoinEvent != null;
        }

        private void setRejoinEvent (RejoinEvent value) {
            this.rejoinEvent = value;
        }

        
        public void selectRejoinEvent (RejoinEvent value) {
            this.rejoinEvent = value;
            
                    setStartEvent(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_StartEventTypeChoiceType;
        }

        private static IASN1PreparedElementData preparedData_StartEventTypeChoiceType = CoderFactory.getInstance().newPreparedElementData(StartEventTypeChoiceType.class);

    }

                
        @ASN1Element ( name = "startEventType", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private StartEventTypeChoiceType startEventType = null;
                
  
        
        public NonZeroId getGameId () {
            return this.gameId;
        }

        

        public void setGameId (NonZeroId value) {
            this.gameId = value;
        }
        
  
        
        public StartEventTypeChoiceType getStartEventType () {
            return this.startEventType;
        }

        

        public void setStartEventType (StartEventTypeChoiceType value) {
            this.startEventType = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_StartEventMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_StartEventMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(StartEventMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "StartEventMessage", isOptional =  false , hasTag =  true, tag = 20, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private StartEventMessageSequenceType  value;        

        
        
        public StartEventMessage () {
        }
        
        
        
        public void setValue(StartEventMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public StartEventMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(StartEventMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            