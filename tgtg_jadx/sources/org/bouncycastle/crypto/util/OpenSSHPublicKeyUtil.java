package org.bouncycastle.crypto.util;

import com.braze.h2;
import i4.a;
import j4.s;
import java.io.IOException;
import m0.i1;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes3.dex */
public class OpenSSHPublicKeyUtil {
    private static final String DSS = "ssh-dss";
    private static final String ECDSA = "ecdsa";
    private static final String ED_25519 = "ssh-ed25519";
    private static final String FIDO2_EC_P256 = "sk-ecdsa-sha2-nistp256@openssh.com";
    private static final String FIDO_ED_25519 = "sk-ssh-ed25519@openssh.com";
    private static final String RSA = "ssh-rsa";

    private OpenSSHPublicKeyUtil() {
    }

    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        if (asymmetricKeyParameter == null) {
            a.f("cipherParameters was null.");
            return null;
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                a.f("RSAKeyParamaters was for encryption");
                return null;
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            SSHBuilder sSHBuilder = new SSHBuilder();
            sSHBuilder.writeString(RSA);
            sSHBuilder.writeBigNum(rSAKeyParameters.getExponent());
            sSHBuilder.writeBigNum(rSAKeyParameters.getModulus());
            return sSHBuilder.getBytes();
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            SSHBuilder sSHBuilder2 = new SSHBuilder();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            String nameForParameters = SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                a.f("unable to derive ssh curve name for ".concat(eCPublicKeyParameters.getParameters().getCurve().getClass().getName()));
                return null;
            }
            sSHBuilder2.writeString("ecdsa-sha2-".concat(nameForParameters));
            sSHBuilder2.writeString(nameForParameters);
            sSHBuilder2.writeBlock(eCPublicKeyParameters.getQ().getEncoded(false));
            return sSHBuilder2.getBytes();
        }
        if (!(asymmetricKeyParameter instanceof DSAPublicKeyParameters)) {
            if (!(asymmetricKeyParameter instanceof Ed25519PublicKeyParameters)) {
                i1.j("unable to convert ", asymmetricKeyParameter.getClass().getName(), " to public key");
                return null;
            }
            SSHBuilder sSHBuilder3 = new SSHBuilder();
            sSHBuilder3.writeString(ED_25519);
            sSHBuilder3.writeBlock(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            return sSHBuilder3.getBytes();
        }
        DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
        DSAParameters parameters = dSAPublicKeyParameters.getParameters();
        SSHBuilder sSHBuilder4 = new SSHBuilder();
        sSHBuilder4.writeString(DSS);
        sSHBuilder4.writeBigNum(parameters.getP());
        sSHBuilder4.writeBigNum(parameters.getQ());
        sSHBuilder4.writeBigNum(parameters.getG());
        sSHBuilder4.writeBigNum(dSAPublicKeyParameters.getY());
        return sSHBuilder4.getBytes();
    }

    public static AsymmetricKeyParameter parsePublicKey(SSHBuffer sSHBuffer) {
        AsymmetricKeyParameter ed25519PublicKeyParameters;
        String string;
        String str;
        String string2 = sSHBuffer.readString();
        if (RSA.equals(string2)) {
            ed25519PublicKeyParameters = new RSAKeyParameters(false, sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive());
        } else if (DSS.equals(string2)) {
            ed25519PublicKeyParameters = new DSAPublicKeyParameters(sSHBuffer.readBigNumPositive(), new DSAParameters(sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive()));
        } else {
            if (string2.startsWith(ECDSA)) {
                string = sSHBuffer.readString();
                ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(string);
                X9ECParameters parameters = SSHNamedCurves.getParameters(byName);
                if (parameters != null) {
                    ed25519PublicKeyParameters = new ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.readBlock()), new ECNamedDomainParameters(byName, parameters));
                }
                h2.b(s.k("unable to find curve for ", string2, " using curve name ", string));
                return null;
            }
            if (string2.equals(FIDO2_EC_P256)) {
                string = sSHBuffer.readString();
                ASN1ObjectIdentifier byName2 = SSHNamedCurves.getByName(string);
                X9ECParameters parameters2 = SSHNamedCurves.getParameters(byName2);
                if (parameters2 != null) {
                    ECCurve curve = parameters2.getCurve();
                    byte[] block = sSHBuffer.readBlock();
                    sSHBuffer.readString();
                    ed25519PublicKeyParameters = new ECPublicKeyParameters(curve.decodePoint(block), new ECNamedDomainParameters(byName2, parameters2));
                }
                h2.b(s.k("unable to find curve for ", string2, " using curve name ", string));
                return null;
            }
            if (ED_25519.equals(string2)) {
                byte[] block2 = sSHBuffer.readBlock();
                if (block2.length == 32) {
                    ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(block2, 0);
                }
                h2.b("public key value of wrong length");
                return null;
            }
            if (FIDO2_EC_P256.equals(string2)) {
                byte[] block3 = sSHBuffer.readBlock();
                if (block3.length == 32) {
                    sSHBuffer.readString();
                    ed25519PublicKeyParameters = new Ed25519PublicKeyParameters(block3, 0);
                }
                h2.b("public key value of wrong length");
                return null;
            }
            ed25519PublicKeyParameters = null;
        }
        if (ed25519PublicKeyParameters == null) {
            str = "unable to parse key";
        } else {
            if (!sSHBuffer.hasRemaining()) {
                return ed25519PublicKeyParameters;
            }
            str = "decoded key has trailing data";
        }
        a.f(str);
        return null;
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new SSHBuffer(bArr));
    }
}
