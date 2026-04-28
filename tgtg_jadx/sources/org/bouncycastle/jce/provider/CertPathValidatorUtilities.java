package org.bouncycastle.jce.provider;

import a40.d0;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import e0.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXCertStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertificate;
import r8.k;

/* JADX INFO: loaded from: classes3.dex */
class CertPathValidatorUtilities {
    protected static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    protected static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    protected static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    protected static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    protected static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    protected static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    protected static final String KEY_USAGE = Extension.keyUsage.getId();
    protected static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    protected static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    protected static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    protected static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    protected static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    protected static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    protected static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    protected static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", PaymentMethodTypes.UNKNOWN, "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    public static void checkCRLCriticalExtensions(X509CRL x509crl, String str) throws AnnotatedException {
        int size;
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null || (size = criticalExtensionOIDs.size()) <= 0) {
            return;
        }
        if (criticalExtensionOIDs.contains(Extension.issuingDistributionPoint.getId())) {
            size--;
        }
        if (criticalExtensionOIDs.contains(Extension.deltaCRLIndicator.getId())) {
            size--;
        }
        if (size <= 0) {
            return;
        }
        a.q(str);
    }

    public static void checkCRLEntryCriticalExtensions(X509CRLEntry x509CRLEntry, String str) throws AnnotatedException {
        if (x509CRLEntry.hasUnsupportedCriticalExtension()) {
            a.q(str);
        }
    }

    public static void checkCRLsNotEmpty(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, Set set, Object obj) throws RecoverableCertPathValidatorException {
        if (set.isEmpty()) {
            if (obj instanceof X509AttributeCertificate) {
                throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0] + "\"", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
            }
            throw new RecoverableCertPathValidatorException("No CRLs found for issuer \"" + RFC4519Style.INSTANCE.toString(PrincipalUtils.getIssuerPrincipal((X509Certificate) obj)) + "\"", null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }

    public static void findCertificates(Set set, PKIXCertStoreSelector pKIXCertStoreSelector, List list) throws AnnotatedException {
        String str;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    set.addAll(((Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (StoreException e5) {
                    e = e5;
                    str = "Problem while picking certificates from X.509 store.";
                    a.k(str, e);
                    return;
                }
            } else {
                try {
                    set.addAll(PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (CertStore) obj));
                } catch (CertStoreException e11) {
                    e = e11;
                    str = "Problem while picking certificates from certificate store.";
                    a.k(str, e);
                    return;
                }
            }
        }
    }

    public static Collection findIssuerCerts(X509Certificate x509Certificate, List<CertStore> list, List<PKIXCertStore> list2) throws AnnotatedException {
        String str;
        byte[] keyIdentifier;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(PrincipalUtils.getIssuerPrincipal(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(AUTHORITY_KEY_IDENTIFIER);
                if (extensionValue != null && (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            } catch (Exception unused) {
            }
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, list);
                findCertificates(linkedHashSet, pKIXCertStoreSelectorBuild, list2);
                return linkedHashSet;
            } catch (AnnotatedException e5) {
                e = e5;
                str = "Issuer certificate cannot be searched.";
                a.k(str, e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            str = "Subject criteria for certificate selector to find issuer certificate could not be set.";
        }
    }

    public static Collection findTargets(PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters) throws CertPathBuilderException {
        PKIXExtendedParameters baseParameters = pKIXExtendedBuilderParameters.getBaseParameters();
        PKIXCertStoreSelector targetConstraints = baseParameters.getTargetConstraints();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            findCertificates(linkedHashSet, targetConstraints, baseParameters.getCertificateStores());
            findCertificates(linkedHashSet, targetConstraints, baseParameters.getCertStores());
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
            Certificate certificate = targetConstraints.getCertificate();
            if (certificate != null) {
                return Collections.singleton(certificate);
            }
            throw new CertPathBuilderException("No certificate found matching targetConstraints.");
        } catch (AnnotatedException e5) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[PHI: r5
      0x003c: PHI (r5v5 org.bouncycastle.asn1.x500.X500Name) = 
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
     binds: [B:13:0x0042, B:15:0x0048, B:17:0x004e, B:34:0x003c, B:21:0x006a, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.cert.TrustAnchor findTrustAnchor(java.security.cert.X509Certificate r8, java.util.Set r9, java.lang.String r10) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            java.security.cert.X509CertSelector r0 = new java.security.cert.X509CertSelector
            r0.<init>()
            javax.security.auth.x500.X500Principal r1 = r8.getIssuerX500Principal()
            r0.setSubject(r1)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L15:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L7a
            if (r3 != 0) goto L7a
            java.lang.Object r3 = r9.next()
            java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            if (r7 == 0) goto L3e
            java.security.cert.X509Certificate r7 = r3.getTrustedCert()
            boolean r7 = r0.match(r7)
            if (r7 == 0) goto L3c
            java.security.cert.X509Certificate r6 = r3.getTrustedCert()
            java.security.PublicKey r6 = r6.getPublicKey()
            goto L70
        L3c:
            r3 = r2
            goto L70
        L3e:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()
            if (r7 == 0) goto L3c
            java.lang.String r7 = r3.getCAName()
            if (r7 == 0) goto L3c
            java.security.PublicKey r7 = r3.getCAPublicKey()
            if (r7 == 0) goto L3c
            if (r5 != 0) goto L5a
            byte[] r5 = r1.getEncoded()
            org.bouncycastle.asn1.x500.X500Name r5 = org.bouncycastle.asn1.x500.X500Name.getInstance(r5)
        L5a:
            javax.security.auth.x500.X500Principal r7 = r3.getCA()     // Catch: java.lang.IllegalArgumentException -> L3c
            byte[] r7 = r7.getEncoded()     // Catch: java.lang.IllegalArgumentException -> L3c
            org.bouncycastle.asn1.x500.X500Name r7 = org.bouncycastle.asn1.x500.X500Name.getInstance(r7)     // Catch: java.lang.IllegalArgumentException -> L3c
            boolean r7 = r5.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L3c
            if (r7 == 0) goto L3c
            java.security.PublicKey r6 = r3.getCAPublicKey()     // Catch: java.lang.IllegalArgumentException -> L3c
        L70:
            if (r6 == 0) goto L15
            verifyX509Certificate(r8, r6, r10)     // Catch: java.lang.Exception -> L76
            goto L15
        L76:
            r4 = move-exception
            r3 = r2
            r6 = r3
            goto L15
        L7a:
            if (r3 != 0) goto L86
            if (r4 != 0) goto L7f
            goto L86
        L7f:
            java.lang.String r8 = "TrustAnchor found but certificate validation failed."
            org.bouncycastle.jce.provider.a.k(r8, r4)
            r8 = 0
            return r8
        L86:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.CertPathValidatorUtilities.findTrustAnchor(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    public static PKIXPolicyNode findValidPolicy(Iterator it, String str) {
        while (it.hasNext()) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) it.next();
            if (str.equals(pKIXPolicyNode.getValidPolicy())) {
                return pKIXPolicyNode;
            }
        }
        return null;
    }

    public static List<PKIXCertStore> getAdditionalStoresFromAltNames(byte[] bArr, Map<GeneralName, PKIXCertStore> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        GeneralName[] names = GeneralNames.getInstance(ASN1OctetString.getInstance(bArr).getOctets()).getNames();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 != names.length; i11++) {
            PKIXCertStore pKIXCertStore = map.get(names[i11]);
            if (pKIXCertStore != null) {
                arrayList.add(pKIXCertStore);
            }
        }
        return arrayList;
    }

    public static List<PKIXCRLStore> getAdditionalStoresFromCRLDistributionPoint(CRLDistPoint cRLDistPoint, Map<GeneralName, PKIXCRLStore> map, Date date, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        if (cRLDistPoint == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            ArrayList arrayList = new ArrayList();
            for (DistributionPoint distributionPoint : distributionPoints) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        PKIXCRLStore pKIXCRLStore = map.get(generalName);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                try {
                    CertificateFactory certificateFactoryCreateCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                    for (DistributionPoint distributionPoint3 : distributionPoints) {
                        DistributionPointName distributionPoint4 = distributionPoint3.getDistributionPoint();
                        if (distributionPoint4 != null && distributionPoint4.getType() == 0) {
                            GeneralName[] names = GeneralNames.getInstance(distributionPoint4.getName()).getNames();
                            int i11 = 0;
                            while (true) {
                                if (i11 < names.length) {
                                    GeneralName generalName2 = names[i11];
                                    if (generalName2.getTagNo() == 6) {
                                        try {
                                            PKIXCRLStore crl = CrlCache.getCrl(certificateFactoryCreateCertificateFactory, date, new URI(((ASN1String) generalName2.getName()).getString()));
                                            if (crl != null) {
                                                arrayList.add(crl);
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                            i11++;
                                        }
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                } catch (Exception e5) {
                    throw new AnnotatedException(k.j(e5, new StringBuilder("cannot create certificate factory: ")), e5);
                }
            }
            return arrayList;
        } catch (Exception e11) {
            a.k("Distribution points could not be read.", e11);
            return null;
        }
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm();
        } catch (Exception e5) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e5);
        }
    }

    public static void getCRLIssuersFromDistributionPoint(DistributionPoint distributionPoint, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        if (distributionPoint.getCRLIssuer() != null) {
            GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
            for (int i11 = 0; i11 < names.length; i11++) {
                if (names[i11].getTagNo() == 4) {
                    try {
                        arrayList.add(X500Name.getInstance(names[i11].getName().toASN1Primitive().getEncoded()));
                    } catch (IOException e5) {
                        a.k("CRL issuer information from distribution point cannot be decoded.", e5);
                        return;
                    }
                }
            }
        } else if (distributionPoint.getDistributionPoint() == null) {
            a.q("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            return;
        } else {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((X500Name) it2.next()).getEncoded());
            } catch (IOException e11) {
                a.k("Cannot decode CRL issuer information.", e11);
                return;
            }
        }
    }

    public static void getCertStatus(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        ASN1Enumerated aSN1Enumerated;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj));
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(certificateIssuer == null ? PrincipalUtils.getIssuerPrincipal(x509crl) : PrincipalUtils.getX500Name(certificateIssuer))) {
                    return;
                }
            } else if (!PrincipalUtils.getEncodedIssuerPrincipal(obj).equals(PrincipalUtils.getIssuerPrincipal(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(getSerialNumber(obj))) == null) {
                return;
            }
            if (revokedCertificate.hasExtensions()) {
                checkCRLEntryCriticalExtensions(revokedCertificate, "CRL entry has unsupported critical extensions.");
                try {
                    aSN1Enumerated = ASN1Enumerated.getInstance(getExtensionValue(revokedCertificate, Extension.reasonCode.getId()));
                } catch (Exception e5) {
                    a.k("Reason code CRL entry extension could not be decoded.", e5);
                    return;
                }
            } else {
                aSN1Enumerated = null;
            }
            int iIntValueExact = aSN1Enumerated == null ? 0 : aSN1Enumerated.intValueExact();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || iIntValueExact == 0 || iIntValueExact == 1 || iIntValueExact == 2 || iIntValueExact == 10) {
                certStatus.setCertStatus(iIntValueExact);
                certStatus.setRevocationDate(revokedCertificate.getRevocationDate());
            }
        } catch (CRLException e11) {
            a.k("Failed check for indirect CRL.", e11);
        }
    }

    public static Set getCompleteCRLs(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, Object obj, PKIXExtendedParameters pKIXExtendedParameters, Date date) throws AnnotatedException, RecoverableCertPathValidatorException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(PrincipalUtils.getEncodedIssuerPrincipal(obj));
            getCRLIssuersFromDistributionPoint(distributionPoint, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            Set setFindCRLs = PKIXCRLUtil.findCRLs(new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build(), date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            checkCRLsNotEmpty(pKIXCertRevocationCheckerParameters, setFindCRLs, obj);
            return setFindCRLs;
        } catch (AnnotatedException e5) {
            a.k("Could not get issuer information from distribution point.", e5);
            return null;
        }
    }

    public static Set getDeltaCRLs(Date date, X509CRL x509crl, List<CertStore> list, List<PKIXCRLStore> list2, JcaJceHelper jcaJceHelper) throws AnnotatedException {
        String str;
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded());
            try {
                ASN1Primitive extensionValue = getExtensionValue(x509crl, CRL_NUMBER);
                BigInteger positiveValue = extensionValue != null ? ASN1Integer.getInstance(extensionValue).getPositiveValue() : null;
                try {
                    byte[] extensionValue2 = x509crl.getExtensionValue(ISSUING_DISTRIBUTION_POINT);
                    x509CRLSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(BigInteger.valueOf(1L)) : null);
                    PKIXCRLStoreSelector.Builder builder = new PKIXCRLStoreSelector.Builder(x509CRLSelector);
                    builder.setIssuingDistributionPoint(extensionValue2);
                    builder.setIssuingDistributionPointEnabled(true);
                    builder.setMaxBaseCRLNumber(positiveValue);
                    builder.setDeltaCRLIndicatorEnabled(true);
                    PKIXCRLStoreSelector<? extends CRL> pKIXCRLStoreSelectorBuild = builder.build();
                    Set deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(pKIXCRLStoreSelectorBuild, date, list, list2));
                    if (!deltaCRLs.isEmpty() || !Properties.isOverrideSet("org.bouncycastle.x509.enableCRLDP")) {
                        return deltaCRLs;
                    }
                    try {
                        CertificateFactory certificateFactoryCreateCertificateFactory = jcaJceHelper.createCertificateFactory("X.509");
                        for (DistributionPoint distributionPoint : CRLDistPoint.getInstance(extensionValue2).getDistributionPoints()) {
                            DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                            if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                                GeneralName[] names = GeneralNames.getInstance(distributionPoint2.getName()).getNames();
                                int i11 = 0;
                                while (true) {
                                    if (i11 < names.length) {
                                        GeneralName generalName = names[i11];
                                        if (generalName.getTagNo() == 6) {
                                            try {
                                                PKIXCRLStore crl = CrlCache.getCrl(certificateFactoryCreateCertificateFactory, date, new URI(((ASN1String) generalName.getName()).getString()));
                                                if (crl != null) {
                                                    deltaCRLs = getDeltaCRLs(PKIXCRLUtil.findCRLs(pKIXCRLStoreSelectorBuild, date, Collections.EMPTY_LIST, Collections.singletonList(crl)));
                                                }
                                            } catch (Exception unused) {
                                                continue;
                                                i11++;
                                            }
                                        }
                                        i11++;
                                    }
                                }
                            }
                        }
                        return deltaCRLs;
                    } catch (Exception e5) {
                        throw new AnnotatedException(k.j(e5, new StringBuilder("cannot create certificate factory: ")), e5);
                    }
                } catch (Exception e11) {
                    e = e11;
                    str = "Issuing distribution point extension value could not be read.";
                    a.k(str, e);
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                str = "CRL number extension could not be extracted from CRL.";
            }
        } catch (IOException e13) {
            e = e13;
            str = "Cannot extract issuer from CRL.";
        }
    }

    public static ASN1Primitive getExtensionValue(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return getObject(str, extensionValue);
    }

    public static PublicKey getNextWorkingKey(List list, int i11, JcaJceHelper jcaJceHelper) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i11)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i11++;
            if (i11 >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i11)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return jcaJceHelper.createKeyFactory("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e5) {
            d0.k(e5.getMessage());
            return null;
        }
    }

    private static ASN1Primitive getObject(String str, byte[] bArr) throws AnnotatedException {
        try {
            return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(bArr).getOctets());
        } catch (Exception e5) {
            throw new AnnotatedException(f.k("exception processing extension ", str), e5);
        }
    }

    public static final Set getQualifierSet(ASN1Sequence aSN1Sequence) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (aSN1Sequence != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream);
            Enumeration objects = aSN1Sequence.getObjects();
            while (objects.hasMoreElements()) {
                try {
                    aSN1OutputStreamCreate.writeObject((ASN1Encodable) objects.nextElement());
                    hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                    byteArrayOutputStream.reset();
                } catch (IOException e5) {
                    throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e5);
                }
            }
        }
        return hashSet;
    }

    private static BigInteger getSerialNumber(Object obj) {
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static Date getValidCertDateFromValidityModel(Date date, int i11, CertPath certPath, int i12) throws AnnotatedException {
        if (1 != i11 || i12 <= 0) {
            return date;
        }
        int i13 = i12 - 1;
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i13);
        if (i13 == 0) {
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i13)).getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? ASN1GeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extensionValue)) : null;
                if (aSN1GeneralizedTime != null) {
                    try {
                        return aSN1GeneralizedTime.getDate();
                    } catch (ParseException e5) {
                        a.k("Date from date of cert gen extension could not be parsed.", e5);
                        return null;
                    }
                }
            } catch (IOException | IllegalArgumentException unused) {
                a.q("Date of cert gen extension could not be read.");
                return null;
            }
        }
        return x509Certificate.getNotBefore();
    }

    public static Date getValidityDate(PKIXExtendedParameters pKIXExtendedParameters, Date date) {
        Date validityDate = pKIXExtendedParameters.getValidityDate();
        return validityDate == null ? date : validityDate;
    }

    private static boolean hasCriticalExtension(Set set, String str) {
        return set != null && set.contains(str);
    }

    public static boolean isAnyPolicy(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }

    private static boolean isDeltaCRL(X509CRL x509crl) {
        return hasCriticalExtension(x509crl, Extension.deltaCRLIndicator.getId());
    }

    public static boolean isIssuerTrustAnchor(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, str) != null;
    }

    public static boolean isSelfIssued(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean processCertD1i(int i11, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        List list = listArr[i11 - 1];
        for (int i12 = 0; i12 < list.size(); i12++) {
            PKIXPolicyNode pKIXPolicyNode = (PKIXPolicyNode) list.get(i12);
            if (pKIXPolicyNode.getExpectedPolicies().contains(aSN1ObjectIdentifier.getId())) {
                HashSet hashSet = new HashSet();
                hashSet.add(aSN1ObjectIdentifier.getId());
                PKIXPolicyNode pKIXPolicyNode2 = new PKIXPolicyNode(new ArrayList(), i11, hashSet, pKIXPolicyNode, set, aSN1ObjectIdentifier.getId(), false);
                pKIXPolicyNode.addChild(pKIXPolicyNode2);
                listArr[i11].add(pKIXPolicyNode2);
                return true;
            }
        }
        return false;
    }

    public static void processCertD1ii(int i11, List[] listArr, ASN1ObjectIdentifier aSN1ObjectIdentifier, Set set) {
        PKIXPolicyNode pKIXPolicyNodeFindValidPolicy = findValidPolicy(listArr[i11 - 1].iterator(), "2.5.29.32.0");
        if (pKIXPolicyNodeFindValidPolicy != null) {
            String id2 = aSN1ObjectIdentifier.getId();
            HashSet hashSet = new HashSet();
            hashSet.add(id2);
            PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), i11, hashSet, pKIXPolicyNodeFindValidPolicy, set, id2, false);
            pKIXPolicyNodeFindValidPolicy.addChild(pKIXPolicyNode);
            listArr[i11].add(pKIXPolicyNode);
        }
    }

    public static PKIXPolicyNode removeChildlessPolicyNodes(PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i11) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        while (true) {
            i11--;
            if (i11 < 0) {
                return pKIXPolicyNode;
            }
            List list = listArr[i11];
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(size);
                    if (!pKIXPolicyNode2.hasChildren()) {
                        list.remove(size);
                        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
                        if (pKIXPolicyNode3 == null) {
                            return null;
                        }
                        pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
                    }
                }
            }
        }
    }

    public static PKIXPolicyNode removePolicyNode(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        if (pKIXPolicyNode == null) {
            return null;
        }
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            removePolicyNodeRecurse(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (List list : listArr) {
            list.clear();
        }
        return null;
    }

    private static void removePolicyNodeRecurse(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                removePolicyNodeRecurse(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }

    public static void verifyX509Certificate(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    public static boolean hasCriticalExtension(X509Certificate x509Certificate, String str) {
        return hasCriticalExtension(x509Certificate.getCriticalExtensionOIDs(), str);
    }

    public static boolean hasCriticalExtension(X509CRL x509crl, String str) {
        return hasCriticalExtension(x509crl.getCriticalExtensionOIDs(), str);
    }

    public static TrustAnchor findTrustAnchor(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return findTrustAnchor(x509Certificate, set, null);
    }

    private static Set getDeltaCRLs(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            if (isDeltaCRL(x509crl)) {
                hashSet.add(x509crl);
            }
        }
        return hashSet;
    }
}
