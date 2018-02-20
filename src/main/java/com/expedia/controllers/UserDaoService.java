package com.expedia.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
private static List<UserInput> locations=new ArrayList<>();

//static {
//	locations.add(new UserSearchResult(new ArrayList<String>().add("30.5157277,-97.597014"),new ArrayList<String>().add("atm"),10.3,"mysql"));
//}

public UserInput save(UserInput user)
{
	if(user.getType()==null)
	{
		user.setType(user.getType());
	}
	locations.add(user);
	return user;
	
}

}
