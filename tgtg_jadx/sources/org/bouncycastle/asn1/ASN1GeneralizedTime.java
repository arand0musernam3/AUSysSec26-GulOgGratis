package org.bouncycastle.asn1;

import b3.i;
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
import java.util.TimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GeneralizedTime.class, 24) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GeneralizedTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length < 4) {
            a.f("GeneralizedTime string too short");
            throw null;
        }
        this.contents = bArr;
        if (isDigit(0) && isDigit(1) && isDigit(2) && isDigit(3)) {
            return;
        }
        a.f("illegal characters in GeneralizedTime string");
        throw null;
    }

    private SimpleDateFormat calculateGMTDateFormat() {
        SimpleDateFormat simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmssz") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String calculateGMTOffset(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i11 = rawOffset / 3600000;
        int i12 = (rawOffset - (3600000 * i11)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    str = pruneFractionalSeconds(str);
                }
                if (timeZone.inDaylightTime(calculateGMTDateFormat().parse(str + "GMT" + str2 + convert(i11) + ":" + convert(i12)))) {
                    i11 += str2.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + convert(i11) + ":" + convert(i12);
    }

    private String convert(int i11) {
        return i11 < 10 ? s.f(i11, "0") : Integer.toString(i11);
    }

    public static ASN1GeneralizedTime createPrimitive(byte[] bArr) {
        return new ASN1GeneralizedTime(bArr);
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        String strI;
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                return (ASN1GeneralizedTime) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1GeneralizedTime) TYPE.fromByteArray((byte[]) obj);
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

    private String pruneFractionalSeconds(String str) {
        StringBuilder sb2;
        String str2;
        String string;
        char cCharAt;
        String strSubstring = str.substring(14);
        int i11 = 1;
        while (i11 < strSubstring.length() && '0' <= (cCharAt = strSubstring.charAt(i11)) && cCharAt <= '9') {
            i11++;
        }
        int i12 = i11 - 1;
        if (i12 > 3) {
            string = strSubstring.substring(0, 4).concat(strSubstring.substring(i11));
        } else {
            if (i12 == 1) {
                sb2 = new StringBuilder();
                sb2.append(strSubstring.substring(0, i11));
                str2 = "00";
            } else {
                if (i12 != 2) {
                    return str;
                }
                sb2 = new StringBuilder();
                sb2.append(strSubstring.substring(0, i11));
                str2 = "0";
            }
            sb2.append(str2);
            sb2.append(strSubstring.substring(i11));
            string = sb2.toString();
        }
        return str.substring(0, 14).concat(string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.areEqual(this.contents, ((ASN1GeneralizedTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 24, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public Date getDate() throws ParseException {
        SimpleDateFormat simpleDateFormatCalculateGMTDateFormat;
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.endsWith("Z")) {
            simpleDateFormatCalculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", LocaleUtil.EN_Locale) : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.EN_Locale) : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", LocaleUtil.EN_Locale) : new SimpleDateFormat("yyyyMMddHH'Z'", LocaleUtil.EN_Locale);
            simpleDateFormatCalculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strFromByteArray.indexOf(45) > 0 || strFromByteArray.indexOf(43) > 0) {
            strFromByteArray = getTime();
            simpleDateFormatCalculateGMTDateFormat = calculateGMTDateFormat();
        } else {
            simpleDateFormatCalculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormatCalculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            strFromByteArray = pruneFractionalSeconds(strFromByteArray);
        }
        return simpleDateFormatCalculateGMTDateFormat.parse(strFromByteArray);
    }

    public String getTime() {
        String strFromByteArray = Strings.fromByteArray(this.contents);
        if (strFromByteArray.charAt(strFromByteArray.length() - 1) == 'Z') {
            return strFromByteArray.substring(0, strFromByteArray.length() - 1).concat("GMT+00:00");
        }
        int length = strFromByteArray.length();
        char cCharAt = strFromByteArray.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strFromByteArray.indexOf("GMT") == length - 9) {
            return strFromByteArray;
        }
        int length2 = strFromByteArray.length();
        int i11 = length2 - 5;
        char cCharAt2 = strFromByteArray.charAt(i11);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strFromByteArray.substring(0, i11));
            sb2.append("GMT");
            int i12 = length2 - 2;
            sb2.append(strFromByteArray.substring(i11, i12));
            sb2.append(":");
            sb2.append(strFromByteArray.substring(i12));
            return sb2.toString();
        }
        int length3 = strFromByteArray.length() - 3;
        char cCharAt3 = strFromByteArray.charAt(length3);
        if (cCharAt3 != '-' && cCharAt3 != '+') {
            StringBuilder sbO = i.o(strFromByteArray);
            sbO.append(calculateGMTOffset(strFromByteArray));
            return sbO.toString();
        }
        return strFromByteArray.substring(0, length3) + "GMT" + strFromByteArray.substring(length3) + ":00";
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.contents);
    }

    public boolean hasFractionalSeconds() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.contents;
            if (i11 == bArr.length) {
                return false;
            }
            if (bArr[i11] == 46 && i11 == 14) {
                return true;
            }
            i11++;
        }
    }

    public boolean hasMinutes() {
        return isDigit(10) && isDigit(11);
    }

    public boolean hasSeconds() {
        return isDigit(12) && isDigit(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERGeneralizedTime(this.contents);
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e5) {
            d.t(e5.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1GeneralizedTime) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
