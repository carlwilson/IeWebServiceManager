
package com.exlibris.dps;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IEWebServices", targetNamespace = "http://dps.exlibris.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IEWebServices {


    /**
     * 
     * @param subType
     * @param type
     * @param pdsHandle
     * @return
     *     returns java.util.List<com.exlibris.dps.MetaData>
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getSharedMDByType", targetNamespace = "")
    @RequestWrapper(localName = "getSharedMDByType", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMDByType")
    @ResponseWrapper(localName = "getSharedMDByTypeResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMDByTypeResponse")
    public List<MetaData> getSharedMDByType(
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "subType", targetNamespace = "")
        String subType,
        @WebParam(name = "type", targetNamespace = "")
        String type)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param event
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws FixityEventException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "generateFixityEvent", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GenerateFixityEvent")
    @ResponseWrapper(localName = "generateFixityEventResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GenerateFixityEventResponse")
    public void generateFixityEvent(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "event", targetNamespace = "")
        FixityEvent event,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws FixityEventException_Exception, LockedIeException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param metadata
     * @param pdsHandle
     * @throws IEWSException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateSharedMD")
    @ResponseWrapper(localName = "updateSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateSharedMDResponse")
    public void updateSharedMD(
        @WebParam(name = "metadata", targetNamespace = "")
        MetaData metadata,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param metadata
     * @param iePID
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateIEMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateIEMD")
    @ResponseWrapper(localName = "updateIEMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateIEMDResponse")
    public void updateIEMD(
        @WebParam(name = "iePID", targetNamespace = "")
        String iePID,
        @WebParam(name = "metadata", targetNamespace = "")
        List<MetaData> metadata,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param flags
     * @param iePid
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getIE", targetNamespace = "")
    @RequestWrapper(localName = "getIE", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIE")
    @ResponseWrapper(localName = "getIEResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIEResponse")
    public String getIE(
        @WebParam(name = "flags", targetNamespace = "")
        Long flags,
        @WebParam(name = "iePid", targetNamespace = "")
        String iePid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param pid
     * @param subType
     * @param type
     * @param pdsHandle
     * @return
     *     returns java.util.List<com.exlibris.dps.MetaData>
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getSharedMD", targetNamespace = "")
    @RequestWrapper(localName = "getSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMD")
    @ResponseWrapper(localName = "getSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMDResponse")
    public List<MetaData> getSharedMD(
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "pid", targetNamespace = "")
        String pid,
        @WebParam(name = "subType", targetNamespace = "")
        String subType,
        @WebParam(name = "type", targetNamespace = "")
        String type)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param mid
     * @param pid
     * @param subType
     * @param type
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getMD", targetNamespace = "")
    @RequestWrapper(localName = "getMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetMD")
    @ResponseWrapper(localName = "getMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetMDResponse")
    public String getMD(
        @WebParam(name = "mid", targetNamespace = "")
        String mid,
        @WebParam(name = "PID", targetNamespace = "")
        String pid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "subType", targetNamespace = "")
        String subType,
        @WebParam(name = "type", targetNamespace = "")
        String type)
        throws IEWSException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param metadata
     * @param commit
     * @param pid
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateMD")
    @ResponseWrapper(localName = "updateMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateMDResponse")
    public void updateMD(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "metadata", targetNamespace = "")
        List<MetaData> metadata,
        @WebParam(name = "PID", targetNamespace = "")
        String pid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param pid
     * @param pdsHandle
     * @param content
     * @return
     *     returns java.lang.String
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @WebResult(name = "updateDNX", targetNamespace = "")
    @RequestWrapper(localName = "updateDNX", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateDNX")
    @ResponseWrapper(localName = "updateDNXResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateDNXResponse")
    public String updateDNX(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "content", targetNamespace = "")
        String content,
        @WebParam(name = "PID", targetNamespace = "")
        String pid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param mid
     * @param pid
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "assignSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AssignSharedMD")
    @ResponseWrapper(localName = "assignSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AssignSharedMDResponse")
    public void assignSharedMD(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "mid", targetNamespace = "")
        String mid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "pid", targetNamespace = "")
        String pid)
        throws IEWSException_Exception, InvalidMIDException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHeartBit", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetHeartBit")
    @ResponseWrapper(localName = "getHeartBitResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetHeartBitResponse")
    public String getHeartBit();

    /**
     * 
     * @param metadata
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @WebResult(name = "createSharedMD", targetNamespace = "")
    @RequestWrapper(localName = "createSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.CreateSharedMD")
    @ResponseWrapper(localName = "createSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.CreateSharedMDResponse")
    public String createSharedMD(
        @WebParam(name = "metadata", targetNamespace = "")
        MetaData metadata,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param pid
     * @param section
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getDNX", targetNamespace = "")
    @RequestWrapper(localName = "getDNX", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetDNX")
    @ResponseWrapper(localName = "getDNXResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetDNXResponse")
    public String getDNX(
        @WebParam(name = "PID", targetNamespace = "")
        String pid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "section", targetNamespace = "")
        String section)
        throws IEWSException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param representationContent
     * @param metadata
     * @param submissionReason
     * @param repPid
     * @param commit
     * @param iePid
     * @param pdsHandle
     * @return
     *     returns long
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws FixityEventException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateRepresentation", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateRepresentation")
    @ResponseWrapper(localName = "updateRepresentationResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UpdateRepresentationResponse")
    public long updateRepresentation(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "iePid", targetNamespace = "")
        String iePid,
        @WebParam(name = "metadata", targetNamespace = "")
        List<MetaData> metadata,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "repPid", targetNamespace = "")
        String repPid,
        @WebParam(name = "representationContent", targetNamespace = "")
        List<RepresentationContent> representationContent,
        @WebParam(name = "submissionReason", targetNamespace = "")
        String submissionReason)
        throws FixityEventException_Exception, IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param ripID
     * @param pdsHandle
     * @return
     *     returns com.exlibris.dps.RipStatusInfo
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getRipStatusInfo", targetNamespace = "")
    @RequestWrapper(localName = "getRipStatusInfo", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetRipStatusInfo")
    @ResponseWrapper(localName = "getRipStatusInfoResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetRipStatusInfoResponse")
    public RipStatusInfo getRipStatusInfo(
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "ripID", targetNamespace = "")
        Long ripID)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param iePid
     * @param preservationType
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getIERepresentations", targetNamespace = "")
    @RequestWrapper(localName = "getIERepresentations", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIERepresentations")
    @ResponseWrapper(localName = "getIERepresentationsResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIERepresentationsResponse")
    public String getIERepresentations(
        @WebParam(name = "iePid", targetNamespace = "")
        String iePid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "preservationType", targetNamespace = "")
        String preservationType)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param mid
     * @param pdsHandle
     * @return
     *     returns com.exlibris.dps.MetaData
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getSharedMDByMid", targetNamespace = "")
    @RequestWrapper(localName = "getSharedMDByMid", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMDByMid")
    @ResponseWrapper(localName = "getSharedMDByMidResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetSharedMDByMidResponse")
    public MetaData getSharedMDByMid(
        @WebParam(name = "mid", targetNamespace = "")
        String mid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws InvalidMIDException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param pid
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "unassignCMS", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UnassignCMS")
    @ResponseWrapper(localName = "unassignCMSResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UnassignCMSResponse")
    public void unassignCMS(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "pid", targetNamespace = "")
        String pid)
        throws IEWSException_Exception, InvalidTypeException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param mid
     * @param pid
     * @param pdsHandle
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "unassignSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UnassignSharedMD")
    @ResponseWrapper(localName = "unassignSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.UnassignSharedMDResponse")
    public void unassignSharedMD(
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "mid", targetNamespace = "")
        String mid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "pid", targetNamespace = "")
        String pid)
        throws IEWSException_Exception, InvalidMIDException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param mid
     * @param pdsHandle
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteSharedMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.DeleteSharedMD")
    @ResponseWrapper(localName = "deleteSharedMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.DeleteSharedMDResponse")
    public void deleteSharedMD(
        @WebParam(name = "mid", targetNamespace = "")
        String mid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws InvalidMIDException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param iePID
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getIEMD", targetNamespace = "")
    @RequestWrapper(localName = "getIEMD", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIEMD")
    @ResponseWrapper(localName = "getIEMDResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetIEMDResponse")
    public String getIEMD(
        @WebParam(name = "iePID", targetNamespace = "")
        String iePID,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param commit
     * @param pid
     * @param cmsSystem
     * @param pdsHandle
     * @param cmsRecordId
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidCMSSystemException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "assignCMS", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AssignCMS")
    @ResponseWrapper(localName = "assignCMSResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AssignCMSResponse")
    public void assignCMS(
        @WebParam(name = "cmsRecordId", targetNamespace = "")
        String cmsRecordId,
        @WebParam(name = "cmsSystem", targetNamespace = "")
        String cmsSystem,
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "pid", targetNamespace = "")
        String pid)
        throws IEWSException_Exception, InvalidCMSSystemException_Exception, InvalidTypeException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param ripID
     * @param pdsHandle
     * @return
     *     returns java.lang.String
     * @throws IEWSException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "getRipStatus", targetNamespace = "")
    @RequestWrapper(localName = "getRipStatus", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetRipStatus")
    @ResponseWrapper(localName = "getRipStatusResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.GetRipStatusResponse")
    public String getRipStatus(
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "ripID", targetNamespace = "")
        Long ripID)
        throws IEWSException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param representationContent
     * @param metadata
     * @param submissionReason
     * @param representationCode
     * @param commit
     * @param representationEntityType
     * @param iePid
     * @param preservationType
     * @param label
     * @param pdsHandle
     * @param arPolicyID
     * @return
     *     returns long
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws FixityEventException_Exception
     * @throws NotInPermanentException_Exception
     * @throws InvalidMIDException_Exception
     * @throws UserAuthorizeException_Exception
     * @throws InvalidTypeException_Exception
     * @throws InvalidXmlException_Exception
     */
    @WebMethod
    @WebResult(name = "addRepresentation", targetNamespace = "")
    @RequestWrapper(localName = "addRepresentation", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AddRepresentation")
    @ResponseWrapper(localName = "addRepresentationResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.AddRepresentationResponse")
    public long addRepresentation(
        @WebParam(name = "arPolicyID", targetNamespace = "")
        String arPolicyID,
        @WebParam(name = "commit", targetNamespace = "")
        Boolean commit,
        @WebParam(name = "iePid", targetNamespace = "")
        String iePid,
        @WebParam(name = "label", targetNamespace = "")
        String label,
        @WebParam(name = "metadata", targetNamespace = "")
        List<MetaData> metadata,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle,
        @WebParam(name = "preservationType", targetNamespace = "")
        String preservationType,
        @WebParam(name = "representationCode", targetNamespace = "")
        String representationCode,
        @WebParam(name = "representationContent", targetNamespace = "")
        List<RepresentationContent> representationContent,
        @WebParam(name = "representationEntityType", targetNamespace = "")
        String representationEntityType,
        @WebParam(name = "submissionReason", targetNamespace = "")
        String submissionReason)
        throws FixityEventException_Exception, IEWSException_Exception, InvalidMIDException_Exception, InvalidTypeException_Exception, InvalidXmlException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

    /**
     * 
     * @param action
     * @param iePid
     * @param pdsHandle
     * @return
     *     returns com.exlibris.dps.IeStatusInfo
     * @throws LockedIeException_Exception
     * @throws IEWSException_Exception
     * @throws NotInPermanentException_Exception
     * @throws UserAuthorizeException_Exception
     */
    @WebMethod
    @WebResult(name = "manageIE", targetNamespace = "")
    @RequestWrapper(localName = "manageIE", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.ManageIE")
    @ResponseWrapper(localName = "manageIEResponse", targetNamespace = "http://dps.exlibris.com/", className = "com.exlibris.dps.ManageIEResponse")
    public IeStatusInfo manageIE(
        @WebParam(name = "action", targetNamespace = "")
        Action action,
        @WebParam(name = "iePid", targetNamespace = "")
        String iePid,
        @WebParam(name = "pdsHandle", targetNamespace = "")
        String pdsHandle)
        throws IEWSException_Exception, LockedIeException_Exception, NotInPermanentException_Exception, UserAuthorizeException_Exception
    ;

}