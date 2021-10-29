package design.patterns.factory;

public class GetPlanFactory {
	//use getPlan method to get object of type Plan   
		public Plan getPlan(String planType){  
			if(planType == null){  
				return null;  
			}  
			  
			else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
				return new CommercialPlan();  
			}   
			else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
				return new InstitutionalPlan();  
			}  
			return null;  
		}  
}
