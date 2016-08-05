package com.thoughtworks.www.samples.servlets;

import com.day.cq.dam.api.Asset;
import com.day.cq.dam.commons.util.AssetReferenceSearch;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

import javax.jcr.Node;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by kxi on 8/4/16.
 */
@SlingServlet(resourceTypes="cq/Page", selectors="time", extensions="json", methods="GET")
public class KxiTimeProviderServlet extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        //response.setContentType("application/json");
        response.setContentType("text/html");
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            response.getWriter().write("<html>" +
                    "<head>" +
                    "</head>" +
                    "<body>Current Time is "+
                        dateFormat.format(date) +
                    "!</body></html>");
        } catch (Exception e) {
            response.getOutputStream().print(new JSONObject().toString());
        }
    }
}
