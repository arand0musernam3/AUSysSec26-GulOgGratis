package org.bouncycastle.asn1.x500.style;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import j4.s;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.i18n.MessageBundle;

/* JADX INFO: loaded from: classes3.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32984c;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32985cn;

    /* JADX INFO: renamed from: dc, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32986dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32987o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* JADX INFO: renamed from: sn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32988sn;

    /* JADX INFO: renamed from: st, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f32989st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierW = s.w("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierW;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW2 = s.w("2.5.4.6");
        f32984c = aSN1ObjectIdentifierW2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW3 = s.w("2.5.4.3");
        f32985cn = aSN1ObjectIdentifierW3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW4 = s.w("0.9.2342.19200300.100.1.25");
        f32986dc = aSN1ObjectIdentifierW4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW5 = s.w("2.5.4.13");
        description = aSN1ObjectIdentifierW5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW6 = s.w("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierW6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW7 = s.w("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierW7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW8 = s.w("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierW8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW9 = s.w("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierW9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW10 = s.w("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierW10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW11 = s.w("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierW11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW12 = s.w("2.5.4.42");
        givenName = aSN1ObjectIdentifierW12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW13 = s.w("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierW13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW14 = s.w("2.5.4.43");
        initials = aSN1ObjectIdentifierW14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW15 = s.w("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierW15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW16 = s.w("2.5.4.7");
        l = aSN1ObjectIdentifierW16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW17 = s.w("2.5.4.31");
        member = aSN1ObjectIdentifierW17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW18 = s.w("2.5.4.41");
        name = aSN1ObjectIdentifierW18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW19 = s.w("2.5.4.10");
        f32987o = aSN1ObjectIdentifierW19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW20 = s.w("2.5.4.11");
        ou = aSN1ObjectIdentifierW20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW21 = s.w("2.5.4.32");
        owner = aSN1ObjectIdentifierW21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW22 = s.w("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierW22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW23 = s.w("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierW23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW24 = s.w("2.5.4.17");
        postalCode = aSN1ObjectIdentifierW24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW25 = s.w("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierW25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW26 = s.w("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierW26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW27 = s.w("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierW27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW28 = s.w("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierW28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW29 = s.w("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierW29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW30 = s.w("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierW30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW31 = s.w("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierW31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW32 = s.w("2.5.4.4");
        f32988sn = aSN1ObjectIdentifierW32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW33 = s.w("2.5.4.8");
        f32989st = aSN1ObjectIdentifierW33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW34 = s.w("2.5.4.9");
        street = aSN1ObjectIdentifierW34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW35 = s.w("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierW35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW36 = s.w("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierW36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW37 = s.w("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierW37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW38 = s.w("2.5.4.12");
        title = aSN1ObjectIdentifierW38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW39 = s.w("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierW39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW40 = s.w("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierW40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW41 = s.w("2.5.4.35");
        userPassword = aSN1ObjectIdentifierW41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW42 = s.w("2.5.4.24");
        x121Address = aSN1ObjectIdentifierW42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierW43 = s.w("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierW43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierW, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierW2, "c");
        hashtable.put(aSN1ObjectIdentifierW3, "cn");
        hashtable.put(aSN1ObjectIdentifierW4, "dc");
        hashtable.put(aSN1ObjectIdentifierW5, "description");
        hashtable.put(aSN1ObjectIdentifierW6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierW7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierW8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierW9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierW10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierW11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierW12, "givenName");
        hashtable.put(aSN1ObjectIdentifierW13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierW14, "initials");
        hashtable.put(aSN1ObjectIdentifierW15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierW16, "l");
        hashtable.put(aSN1ObjectIdentifierW17, "member");
        hashtable.put(aSN1ObjectIdentifierW18, "name");
        hashtable.put(aSN1ObjectIdentifierW19, "o");
        hashtable.put(aSN1ObjectIdentifierW20, "ou");
        hashtable.put(aSN1ObjectIdentifierW21, "owner");
        hashtable.put(aSN1ObjectIdentifierW22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierW23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierW24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierW25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierW26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierW27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierW28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierW29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierW30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierW31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierW32, "sn");
        hashtable.put(aSN1ObjectIdentifierW33, "st");
        hashtable.put(aSN1ObjectIdentifierW34, "street");
        hashtable.put(aSN1ObjectIdentifierW35, EContextPaymentMethod.TELEPHONE_NUMBER);
        hashtable.put(aSN1ObjectIdentifierW36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierW37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierW38, MessageBundle.TITLE_ENTRY);
        hashtable.put(aSN1ObjectIdentifierW39, "uid");
        hashtable.put(aSN1ObjectIdentifierW40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierW41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierW42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierW43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierW);
        hashtable2.put("c", aSN1ObjectIdentifierW2);
        hashtable2.put("cn", aSN1ObjectIdentifierW3);
        hashtable2.put("dc", aSN1ObjectIdentifierW4);
        hashtable2.put("description", aSN1ObjectIdentifierW5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierW6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierW7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierW8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierW9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierW10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierW11);
        hashtable2.put("givenname", aSN1ObjectIdentifierW12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierW13);
        hashtable2.put("initials", aSN1ObjectIdentifierW14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierW15);
        hashtable2.put("l", aSN1ObjectIdentifierW16);
        hashtable2.put("member", aSN1ObjectIdentifierW17);
        hashtable2.put("name", aSN1ObjectIdentifierW18);
        hashtable2.put("o", aSN1ObjectIdentifierW19);
        hashtable2.put("ou", aSN1ObjectIdentifierW20);
        hashtable2.put("owner", aSN1ObjectIdentifierW21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierW22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierW23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierW24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierW25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierW26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierW27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierW28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierW29);
        hashtable2.put("seealso", aSN1ObjectIdentifierW30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierW31);
        hashtable2.put("sn", aSN1ObjectIdentifierW32);
        hashtable2.put("st", aSN1ObjectIdentifierW33);
        hashtable2.put("street", aSN1ObjectIdentifierW34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierW35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierW36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierW37);
        hashtable2.put(MessageBundle.TITLE_ENTRY, aSN1ObjectIdentifierW38);
        hashtable2.put("uid", aSN1ObjectIdentifierW39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierW40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierW41);
        hashtable2.put("x121address", aSN1ObjectIdentifierW42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierW43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) f32986dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f32984c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rdnArrRDNsFromString.length];
        for (int i11 = 0; i11 != rdnArrRDNsFromString.length; i11++) {
            rdnArr[(r0 - i11) - 1] = rdnArrRDNsFromString[i11];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z11 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z11) {
                z11 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
