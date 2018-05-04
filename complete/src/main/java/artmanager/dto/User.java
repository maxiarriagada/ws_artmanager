package artmanager.dto;

public class User {
	
	private Long id;
	private Long uid;
	private String username;
	private String preventorname;
	private String password="";
	private String imei;
	private String logindate;
	private String logoutdate;
	private String role;
	private String token;
	
	private String statusText;
	
	
	public User() {
		
	}
	
	public User(artmanager.entity.User user) {
		if(user!=null){
			if(user.getId()!=null){this.setId(user.getId());}
			if(user.getUid()!=null){this.setUid(user.getUid());}
			if(user.getUsername()!=null){this.setUsername(user.getUsername());}
			if(user.getPassword()!=null){this.setPassword(user.getPassword());}
			if(user.getImei()!=null){this.setImei(user.getImei());}
			if(user.getLogindate()!=null){this.setLogindate(user.getLogindate());}
			if(user.getLogoutdate()!=null){this.setLogoutdate(user.getLogoutdate());}
			if(user.getRole()!=null){this.setRole(user.getRole());}		
			if(user.getToken()!=null){this.setToken(user.getToken());}		
		}
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	
	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getLogindate() {
		return logindate;
	}

	public void setLogindate(String logindate) {
		this.logindate = logindate;
	}

	public String getLogoutdate() {
		return logoutdate;
	}

	public void setLogoutdate(String logoutdate) {
		this.logoutdate = logoutdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPreventorname() {
		return preventorname;
	}

	public void setPreventorname(String preventorname) {
		this.preventorname = preventorname;
	}
	
	

}
