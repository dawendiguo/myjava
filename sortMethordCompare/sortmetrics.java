final class SortMetrics implements Cloneable {
	public long probeCnt,	//simple data probes 
				compareCnt,	//comparing two elements
				swapCnt;	//swapping two elements

	public void init(){
		probeCnt = swapCnt = compareCnt = 0;
	}

	public String toString(){
		return probeCnt + " probes " +
			compareCnt + " compares " +
			swapCnt + " swaps ";
	}

	public SortMetrics clone(){
		try {
			//default mechanism works
			return (SortMetrics) super.clone();
		}catch(CloneNotSupportedException e){
			//can't happed: this and Object both clone
			throw new InternalError(e.toString());
		}
	}
}

