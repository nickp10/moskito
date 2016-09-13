package net.anotheria.moskito.webui.dashboards.action;

import net.anotheria.maf.action.ActionCommand;
import net.anotheria.maf.action.ActionMapping;
import net.anotheria.maf.bean.FormBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 12.08.16 23:16
 */
public class DashboardRemoveThresholdAction extends BaseDashboardAction{
	@Override
	public ActionCommand execute(ActionMapping actionMapping, FormBean formBean, HttpServletRequest request, HttpServletResponse response) throws Exception {

		String elementName = request.getParameter("pElement");
		String dashboard = request.getParameter("pName");

		if (dashboard == null || elementName == null) {
			setInfoMessage("Nothing selected!");
			return actionMapping.redirect();
		}

		getDashboardAPI().removeThresholdFromDashboard(dashboard, elementName);

		setInfoMessage("Threshold \'"+elementName+"\' has been removed from dashboard \'"+dashboard+"\'");

		return actionMapping.redirect()
				.addParameter("dashboard", dashboard);
	}
}
