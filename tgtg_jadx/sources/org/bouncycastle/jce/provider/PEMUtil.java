package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    public PEMUtil(String str) {
        this._header1 = a0.p("-----BEGIN ", str, "-----");
        this._header2 = a0.p("-----BEGIN X509 ", str, "-----");
        this._footer1 = a0.p("-----END ", str, "-----");
        this._footer2 = a0.p("-----END X509 ", str, "-----");
    }

    private String readLine(InputStream inputStream) throws IOException {
        int i11;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i11 = inputStream.read();
            if (i11 == 13 || i11 == 10 || i11 < 0) {
                if (i11 < 0 || stringBuffer.length() != 0) {
                    break;
                }
            } else if (i11 != 13) {
                stringBuffer.append((char) i11);
            }
        }
        if (i11 < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public ASN1Sequence readPEMObject(InputStream inputStream) throws IOException {
        String line;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            line = readLine(inputStream);
            if (line == null || line.startsWith(this._header1)) {
                break;
            }
        } while (!line.startsWith(this._header2));
        while (true) {
            String line2 = readLine(inputStream);
            if (line2 == null || line2.startsWith(this._footer1) || line2.startsWith(this._footer2)) {
                break;
            }
            stringBuffer.append(line2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        ASN1Primitive object = new ASN1InputStream(Base64.decode(stringBuffer.toString())).readObject();
        if (object instanceof ASN1Sequence) {
            return (ASN1Sequence) object;
        }
        i4.a.k("malformed PEM data encountered");
        return null;
    }
}
