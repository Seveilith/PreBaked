package grupp6.svp.domain;

import grupp6.svp.data.DataTransferObjects.DataTransferObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by malinvagnborg on 2017-05-10.
 */
public class Balloon extends DomainObject {

    private String balloonId;

    private String balloonCol;

    public Balloon(String balloonId, String balloonColour){
        this.balloonId = balloonId;
        balloonCol = balloonColour;

        // DataFacade.register(this);
    }

    public String getBalloonId() {
        return balloonId;
    }

    public void setBalloonId(String balloonId) {
        this.balloonId = balloonId;
    }

    public String getBalloonCol() {
        return balloonCol;
    }

    public void setBalloonCol(String balloonCol) {
        this.balloonCol = balloonCol;
    }

    @Override
    public DataTransferObject create(HttpServletResponse response, HttpServletRequest request) {
        return null;
    }
}
