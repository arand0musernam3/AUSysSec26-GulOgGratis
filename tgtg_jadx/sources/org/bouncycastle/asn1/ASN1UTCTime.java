package org.bouncycastle.asn1;

import e0.f;
import i4.a;
import j4.d;
import j4.s;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1UTCTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UTCTime.class, 23) { // from class: org.bouncycastle.asn1.ASN1UTCTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UTCTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length < 2) {
            a.f("UTCTime string too short");
            throw null;
        }
        this.contents = bArr;
        if (isDigit(0) && isDigit(1)) {
            return;
        }
        a.f("illegal characters in UTCTime string");
        throw null;
    }

    public static ASN1UTCTime createPrimitive(byte[] bArr) {
        return new ASN1UTCTime(bArr);
    }

    public static ASN1UTCTime getInstance(Object obj) {
        String strI;
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UTCTime) {
                return (ASN1UTCTime) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1UTCTime) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e5) {
                strI = s.i(e5, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            strI = f.j(obj, "illegal object in getInstance: ");
        }
        a.f(strI);
        return null;
    }

    private boolean isDigit(int i11) {
        byte b8;
        byte[] bArr = this.contents;
        return bArr.length > i11 && (b8 = bArr[i11]) >= 48 && b8 <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.contents, ((ASN1UTCTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 23, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public Date getAdjustedDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        return (time.charAt(0) < '5' ? "20" : "19").concat(time);
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyMMddHHmmssz", LocaleUtil.EN_Locale).parse(getTime());
    }

    public String getTime() {
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.indexOf(45) < 0 && strFromByteArray.indexOf(43) < 0) {
            return strFromByteArray.length() == 11 ? strFromByteArray.substring(0, 10).concat("00GMT+00:00") : strFromByteArray.substring(0, 12).concat("GMT+00:00");
        }
        int iIndexOf = strFromByteArray.indexOf(45);
        if (iIndexOf < 0) {
            iIndexOf = strFromByteArray.indexOf(43);
        }
        if (iIndexOf == strFromByteArray.length() - 3) {
            strFromByteArray = strFromByteArray.concat("00");
        }
        if (iIndexOf == 10) {
            return strFromByteArray.substring(0, 10) + "00GMT" + strFromByteArray.substring(10, 13) + ":" + strFromByteArray.substring(13, 15);
        }
        return strFromByteArray.substring(0, 12) + "GMT" + strFromByteArray.substring(12, 15) + ":" + strFromByteArray.substring(15, 17);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return Strings.fromByteArray(this.contents);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e5) {
            d.t(e5.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1UTCTime) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
