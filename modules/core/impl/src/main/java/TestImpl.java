import javax.ejb.Stateless;


@Stateless
public class TestImpl implements Test {

	@Override
	public void hello() {
		System.out.println("Hello");
	}

}
