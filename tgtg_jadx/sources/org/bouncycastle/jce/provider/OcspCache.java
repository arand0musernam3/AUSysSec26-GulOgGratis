package org.bouncycastle.jce.provider;

import j4.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.ocsp.ResponseBytes;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.ocsp.TBSRequest;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<CertID, OCSPResponse>>> cache = Collections.synchronizedMap(new WeakHashMap());

    public static OCSPResponse getOcspResponse(CertID certID, PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, URI uri, X509Certificate x509Certificate, List<Extension> list, JcaJceHelper jcaJceHelper) throws CertPathValidatorException {
        OCSPResponse oCSPResponse;
        WeakReference<Map<CertID, OCSPResponse>> weakReference = cache.get(uri);
        Map<CertID, OCSPResponse> map = weakReference != null ? weakReference.get() : null;
        if (map != null && (oCSPResponse = map.get(certID)) != null) {
            if (isCertIDFoundAndCurrent(BasicOCSPResponse.getInstance(ASN1OctetString.getInstance(oCSPResponse.getResponseBytes().getResponse()).getOctets()), pKIXCertRevocationCheckerParameters.getValidDate(), certID)) {
                return oCSPResponse;
            }
            map.remove(certID);
        }
        try {
            URL url = uri.toURL();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new Request(certID, null));
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            byte[] bArrClone = null;
            for (int i11 = 0; i11 != list.size(); i11++) {
                Extension extension = list.get(i11);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(extension.getId());
                DEROctetString dEROctetString = new DEROctetString(extension.getValue());
                if (OCSPObjectIdentifiers.id_pkix_ocsp_nonce.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                    bArrClone = Arrays.clone(dEROctetString.getOctets());
                }
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.x509.Extension(aSN1ObjectIdentifier, extension.isCritical(), dEROctetString));
            }
            try {
                byte[] encoded = new OCSPRequest(aSN1EncodableVector2.size() != 0 ? new TBSRequest((GeneralName) null, new DERSequence(aSN1EncodableVector), Extensions.getInstance(new DERSequence(aSN1EncodableVector2))) : new TBSRequest((GeneralName) null, new DERSequence(aSN1EncodableVector), (Extensions) null), null).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(encoded.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                OCSPResponse oCSPResponse2 = OCSPResponse.getInstance(Streams.readAllLimited(inputStream, contentLength));
                if (oCSPResponse2.getResponseStatus().getIntValue() != 0) {
                    throw new CertPathValidatorException("OCSP responder failed: " + oCSPResponse2.getResponseStatus().getValue(), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                ResponseBytes responseBytes = ResponseBytes.getInstance(oCSPResponse2.getResponseBytes());
                if (responseBytes.getResponseType().equals((ASN1Primitive) OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
                    BasicOCSPResponse basicOCSPResponse = BasicOCSPResponse.getInstance(responseBytes.getResponse().getOctets());
                    if (ProvOcspRevocationChecker.validatedOcspResponse(basicOCSPResponse, pKIXCertRevocationCheckerParameters, bArrClone, x509Certificate, jcaJceHelper) && isCertIDFoundAndCurrent(basicOCSPResponse, pKIXCertRevocationCheckerParameters.getValidDate(), certID)) {
                        WeakReference<Map<CertID, OCSPResponse>> weakReference2 = cache.get(uri);
                        if (weakReference2 != null) {
                            map = weakReference2.get();
                        }
                        if (map != null) {
                            map.put(certID, oCSPResponse2);
                            return oCSPResponse2;
                        }
                        HashMap map2 = new HashMap();
                        map2.put(certID, oCSPResponse2);
                        cache.put(uri, new WeakReference<>(map2));
                        return oCSPResponse2;
                    }
                }
                throw new CertPathValidatorException("OCSP response failed to validate", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            } catch (IOException e5) {
                throw new CertPathValidatorException(s.g(e5, new StringBuilder("configuration error: ")), e5, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
        } catch (MalformedURLException e11) {
            throw new CertPathValidatorException("configuration error: " + e11.getMessage(), e11, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    private static boolean isCertIDFoundAndCurrent(BasicOCSPResponse basicOCSPResponse, Date date, CertID certID) {
        ASN1Sequence responses = ResponseData.getInstance(basicOCSPResponse.getTbsResponseData()).getResponses();
        for (int i11 = 0; i11 != responses.size(); i11++) {
            SingleResponse singleResponse = SingleResponse.getInstance(responses.getObjectAt(i11));
            if (certID.equals(singleResponse.getCertID())) {
                ASN1GeneralizedTime nextUpdate = singleResponse.getNextUpdate();
                if (nextUpdate != null) {
                    return !date.after(nextUpdate.getDate());
                }
                return true;
            }
        }
        return false;
    }
}
