package net.anotheria.moskito.webui.accumulators.api;

import net.anotheria.moskito.webui.shared.api.TieablePO;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Incoming parameter object for accumulator operations.
 *
 * @author lrosenberg
 * @since 13.02.13 17:36
 */
public class AccumulatorPO extends TieablePO implements Serializable{
	/**
	 * SerialVersionUID.
	 */
	private static final long serialVersionUID = -5369404731183317597L;

	public static AccumulatorPO fromHttpServletRequest(HttpServletRequest request){
		AccumulatorPO ret = new AccumulatorPO();
		ret.parseHttpRequest(request);
		return ret;
	}

}
