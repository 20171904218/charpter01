package itheima;

public class UserServiceImpl implements UserService{
	//声明UserDao属性
	private UserDao userDdao;
	//添加 UserDao属性的setter方法，用于实现依赖注入
	public void setUserDao(UserDao userDao){
		this.userDdao=userDao;
	}

	@Override
	public void say() {
		//调用userDao中的say方法，并执行输出语句
		this.userDdao.say();
		System.out.println("setter注入");
	}

}
