package helpers;

import java.util.Collection;
import java.util.Map;
/**
 * 一些常用的判空方法
 * @author aric
 *
 */
public class ValidateHelper {
	
	public boolean isEmpytString(String string){
		if (null==string || string.isEmpty()){
			return true;
		}
		return false;
	}
	
	public boolean isNotEmpytString(String string){
		return !isEmpytString(string);
	}
	
	public boolean isEmpytCollection(Collection<Object> collection){
		if(null == collection || collection.isEmpty()){
			return true;
		}
		return false;
	}
	public boolean isNotEmptyCollection(Collection<Object> collection){
		return !isEmpytCollection(collection);
	}
	
	public boolean isEmpytMap(Map<Object, Object> map){
		if(null==map || map.isEmpty()){
			return true;
		}
		return false;
	}

}
