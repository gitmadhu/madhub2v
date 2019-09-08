package in.bonakula.jcore.service;

public class FinalizeUse {
	private static int id;
	private int myId;

	FinalizeUse() {
		myId = id++;
		System.out.println("Created # " + myId);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized # " + myId);
		super.finalize();
	}

	public static void main(String[] args) {
		FinalizeUse obj;

		for (int i = 0; i < 1000; i++) {
			obj = new FinalizeUse();

		}

	}

}
