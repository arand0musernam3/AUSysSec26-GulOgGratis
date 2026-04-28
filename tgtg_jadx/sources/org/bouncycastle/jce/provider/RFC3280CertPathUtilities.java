package org.bouncycastle.jce.provider;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import j4.s;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class RFC3280CertPathUtilities {
    public static final String ANY_POLICY = "2.5.29.32.0";
    protected static final int CRL_SIGN = 6;
    protected static final int KEY_CERT_SIGN = 5;
    private static final Class revChkClass = ClassUtil.loadClass(RFC3280CertPathUtilities.class, "java.security.cert.PKIXRevocationChecker");
    public static final String CERTIFICATE_POLICIES = Extension.certificatePolicies.getId();
    public static final String POLICY_MAPPINGS = Extension.policyMappings.getId();
    public static final String INHIBIT_ANY_POLICY = Extension.inhibitAnyPolicy.getId();
    public static final String ISSUING_DISTRIBUTION_POINT = Extension.issuingDistributionPoint.getId();
    public static final String FRESHEST_CRL = Extension.freshestCRL.getId();
    public static final String DELTA_CRL_INDICATOR = Extension.deltaCRLIndicator.getId();
    public static final String POLICY_CONSTRAINTS = Extension.policyConstraints.getId();
    public static final String BASIC_CONSTRAINTS = Extension.basicConstraints.getId();
    public static final String CRL_DISTRIBUTION_POINTS = Extension.cRLDistributionPoints.getId();
    public static final String SUBJECT_ALTERNATIVE_NAME = Extension.subjectAlternativeName.getId();
    public static final String NAME_CONSTRAINTS = Extension.nameConstraints.getId();
    public static final String AUTHORITY_KEY_IDENTIFIER = Extension.authorityKeyIdentifier.getId();
    public static final String KEY_USAGE = Extension.keyUsage.getId();
    public static final String CRL_NUMBER = Extension.cRLNumber.getId();
    protected static final String[] crlReasons = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", PaymentMethodTypes.UNKNOWN, "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    private static void checkCRL(PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, Date date, Date date2, X509Certificate x509Certificate, X509Certificate x509Certificate2, PublicKey publicKey, CertStatus certStatus, ReasonsMask reasonsMask, List list, JcaJceHelper jcaJceHelper) throws AnnotatedException, RecoverableCertPathValidatorException {
        if (date2.getTime() > date.getTime()) {
            a.q("Validation time is in future.");
            return;
        }
        Iterator it = CertPathValidatorUtilities.getCompleteCRLs(pKIXCertRevocationCheckerParameters, distributionPoint, x509Certificate, pKIXExtendedParameters, date2).iterator();
        boolean z11 = false;
        AnnotatedException e5 = null;
        while (it.hasNext() && certStatus.getCertStatus() == 11 && !reasonsMask.isAllReasons()) {
            try {
                X509CRL x509crl = (X509CRL) it.next();
                ReasonsMask reasonsMaskProcessCRLD = processCRLD(x509crl, distributionPoint);
                if (reasonsMaskProcessCRLD.hasNewReasons(reasonsMask)) {
                    try {
                        X509CRL x509crlProcessCRLH = pKIXExtendedParameters.isUseDeltasEnabled() ? processCRLH(CertPathValidatorUtilities.getDeltaCRLs(date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores(), jcaJceHelper), processCRLG(x509crl, processCRLF(x509crl, x509Certificate, x509Certificate2, publicKey, pKIXExtendedParameters, list, jcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        processCRLB1(distributionPoint, x509Certificate, x509crl);
                        processCRLB2(distributionPoint, x509Certificate, x509crl);
                        processCRLC(x509crlProcessCRLH, x509crl, pKIXExtendedParameters);
                        processCRLI(date2, x509crlProcessCRLH, x509Certificate, certStatus, pKIXExtendedParameters);
                        processCRLJ(date2, x509crl, x509Certificate, certStatus);
                        if (certStatus.getCertStatus() == 8) {
                            certStatus.setCertStatus(11);
                        }
                        reasonsMask.addReasons(reasonsMaskProcessCRLD);
                        CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crl, "CRL contains unsupported critical extensions.");
                        if (x509crlProcessCRLH != null) {
                            CertPathValidatorUtilities.checkCRLCriticalExtensions(x509crlProcessCRLH, "Delta CRL contains unsupported critical extensions.");
                        }
                        z11 = true;
                    } catch (AnnotatedException e11) {
                        e5 = e11;
                    }
                } else {
                    continue;
                }
            } catch (AnnotatedException e12) {
                e5 = e12;
            }
        }
        if (!z11) {
            throw e5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters r19, org.bouncycastle.jcajce.PKIXExtendedParameters r20, java.util.Date r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.cert.X509Certificate r24, java.security.PublicKey r25, java.util.List r26, org.bouncycastle.jcajce.util.JcaJceHelper r27) throws org.bouncycastle.jce.provider.AnnotatedException, org.bouncycastle.jce.provider.RecoverableCertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.checkCRLs(org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, java.util.Date, java.security.cert.X509Certificate, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        r6 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getQualifierSet(r7.getPolicyQualifiers());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.bouncycastle.jce.provider.PKIXPolicyNode prepareCertB(java.security.cert.CertPath r10, int r11, java.util.List[] r12, org.bouncycastle.jce.provider.PKIXPolicyNode r13, int r14) throws java.security.cert.CertPathValidatorException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareCertB(java.security.cert.CertPath, int, java.util.List[], org.bouncycastle.jce.provider.PKIXPolicyNode, int):org.bouncycastle.jce.provider.PKIXPolicyNode");
    }

    public static void prepareNextCertA(CertPath certPath, int i11) throws CertPathValidatorException {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_MAPPINGS));
            if (aSN1Sequence != null) {
                for (int i12 = 0; i12 < aSN1Sequence.size(); i12++) {
                    try {
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i12));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0));
                        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(1));
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier.getId())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i11);
                        }
                        if (ANY_POLICY.equals(aSN1ObjectIdentifier2.getId())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, i11);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        str = "Policy mappings extension contents could not be decoded.";
                        a.l(str, e, certPath, i11);
                        return;
                    }
                }
            }
        } catch (AnnotatedException e11) {
            e = e11;
            str = "Policy mappings extension could not be decoded.";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void prepareNextCertG(java.security.cert.CertPath r3, int r4, org.bouncycastle.jce.provider.PKIXNameConstraintValidator r5) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.NAME_CONSTRAINTS     // Catch: java.lang.Exception -> L1b
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L1b
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L1d
            org.bouncycastle.asn1.x509.NameConstraints r0 = org.bouncycastle.asn1.x509.NameConstraints.getInstance(r0)     // Catch: java.lang.Exception -> L1b
            goto L1e
        L1b:
            r5 = move-exception
            goto L48
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L47
            org.bouncycastle.asn1.x509.GeneralSubtree[] r1 = r0.getPermittedSubtrees()
            if (r1 == 0) goto L31
            r5.intersectPermittedSubtree(r1)     // Catch: java.lang.Exception -> L2a
            goto L31
        L2a:
            r5 = move-exception
            java.lang.String r0 = "Permitted subtrees cannot be build from name constraints extension."
        L2d:
            org.bouncycastle.jce.provider.a.l(r0, r5, r3, r4)
            return
        L31:
            org.bouncycastle.asn1.x509.GeneralSubtree[] r0 = r0.getExcludedSubtrees()
            if (r0 == 0) goto L47
            r1 = 0
        L38:
            int r2 = r0.length
            if (r1 == r2) goto L47
            r2 = r0[r1]     // Catch: java.lang.Exception -> L43
            r5.addExcludedSubtree(r2)     // Catch: java.lang.Exception -> L43
            int r1 = r1 + 1
            goto L38
        L43:
            r5 = move-exception
            java.lang.String r0 = "Excluded subtrees cannot be build from name constraints extension."
            goto L2d
        L47:
            return
        L48:
            java.lang.String r0 = "Name constraints extension could not be decoded."
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertG(java.security.cert.CertPath, int, org.bouncycastle.jce.provider.PKIXNameConstraintValidator):void");
    }

    public static int prepareNextCertH1(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    public static int prepareNextCertH2(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    public static int prepareNextCertH3(CertPath certPath, int i11, int i12) {
        return (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11)) || i12 == 0) ? i12 : i12 - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r3 >= r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI1(java.security.cert.CertPath r3, int r4, int r5) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r3.getCertificates()
            java.lang.Object r0 = r0.get(r4)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L43
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L43
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L42
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3a
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r2 != 0) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3a
            int r3 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3a
            if (r3 >= r5) goto L42
            return r3
        L3a:
            r5 = move-exception
            java.lang.String r0 = "Policy constraints extension contents cannot be decoded."
        L3d:
            org.bouncycastle.jce.provider.a.l(r0, r5, r3, r4)
            r3 = 0
            return r3
        L42:
            return r5
        L43:
            r5 = move-exception
            java.lang.String r0 = "Policy constraints extension cannot be decoded."
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI1(java.security.cert.CertPath, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, false).intValueExact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r4 >= r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int prepareNextCertI2(java.security.cert.CertPath r4, int r5, int r6) throws java.security.cert.CertPathValidatorException {
        /*
            java.util.List r0 = r4.getCertificates()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.lang.String r1 = org.bouncycastle.jce.provider.RFC3280CertPathUtilities.POLICY_CONSTRAINTS     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getExtensionValue(r0, r1)     // Catch: java.lang.Exception -> L44
            org.bouncycastle.asn1.ASN1Sequence r0 = org.bouncycastle.asn1.ASN1Sequence.getInstance(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L43
            java.util.Enumeration r0 = r0.getObjects()
        L1a:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.IllegalArgumentException -> L3b
            org.bouncycastle.asn1.ASN1TaggedObject r1 = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r2 = r1.getTagNo()     // Catch: java.lang.IllegalArgumentException -> L3b
            r3 = 1
            if (r2 != r3) goto L1a
            r0 = 0
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L3b
            int r4 = r0.intValueExact()     // Catch: java.lang.IllegalArgumentException -> L3b
            if (r4 >= r6) goto L43
            return r4
        L3b:
            r6 = move-exception
            java.lang.String r0 = "Policy constraints extension contents cannot be decoded."
        L3e:
            org.bouncycastle.jce.provider.a.l(r0, r6, r4, r5)
            r4 = 0
            return r4
        L43:
            return r6
        L44:
            r6 = move-exception
            java.lang.String r0 = "Policy constraints extension cannot be decoded."
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.prepareNextCertI2(java.security.cert.CertPath, int, int):int");
    }

    public static int prepareNextCertJ(CertPath certPath, int i11, int i12) throws CertPathValidatorException {
        int iIntValueExact;
        try {
            ASN1Integer aSN1Integer = ASN1Integer.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), INHIBIT_ANY_POLICY));
            return (aSN1Integer == null || (iIntValueExact = aSN1Integer.intValueExact()) >= i12) ? i12 : iIntValueExact;
        } catch (Exception e5) {
            a.l("Inhibit any-policy extension cannot be decoded.", e5, certPath, i11);
            return 0;
        }
    }

    public static void prepareNextCertK(CertPath certPath, int i11) throws CertPathValidatorException {
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            if (basicConstraints == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, i11);
            }
            if (!basicConstraints.isCA()) {
                throw new CertPathValidatorException("Not a CA certificate", null, certPath, i11);
            }
        } catch (Exception e5) {
            a.l("Basic constraints extension cannot be decoded.", e5, certPath, i11);
        }
    }

    public static int prepareNextCertL(CertPath certPath, int i11, int i12) throws CertPathValidatorException {
        if (CertPathValidatorUtilities.isSelfIssued((X509Certificate) certPath.getCertificates().get(i11))) {
            return i12;
        }
        if (i12 > 0) {
            return i12 - 1;
        }
        a.l("Max path length not greater than zero", null, certPath, i11);
        return 0;
    }

    public static int prepareNextCertM(CertPath certPath, int i11, int i12) throws CertPathValidatorException {
        ASN1Integer pathLenConstraintInteger;
        try {
            BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), BASIC_CONSTRAINTS));
            return (basicConstraints == null || !basicConstraints.isCA() || (pathLenConstraintInteger = basicConstraints.getPathLenConstraintInteger()) == null) ? i12 : Math.min(i12, pathLenConstraintInteger.intPositiveValueExact());
        } catch (Exception e5) {
            a.l("Basic constraints extension cannot be decoded.", e5, certPath, i11);
            return 0;
        }
    }

    public static void prepareNextCertN(CertPath certPath, int i11) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i11)).getKeyUsage();
        if (keyUsage != null) {
            if (keyUsage.length <= 5 || !keyUsage[5]) {
                a.l("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i11);
            }
        }
    }

    public static void prepareNextCertO(CertPath certPath, int i11, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i11);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e5) {
                throw new CertPathValidatorException(e5.getMessage(), e5.getCause(), certPath, i11);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i11);
    }

    public static void processCRLB1(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT);
        boolean z11 = true;
        boolean z12 = extensionValue != null && IssuingDistributionPoint.getInstance(extensionValue).isIndirectCRL();
        try {
            byte[] encoded = PrincipalUtils.getIssuerPrincipal(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z13 = false;
                for (int i11 = 0; i11 < names.length; i11++) {
                    if (names[i11].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i11].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z13 = true;
                            }
                        } catch (IOException e5) {
                            a.k("CRL issuer information from distribution point cannot be decoded.", e5);
                            return;
                        }
                    }
                }
                if (z13 && !z12) {
                    a.q("Distribution point contains cRLIssuer field but CRL is not indirect.");
                    return;
                } else {
                    if (!z13) {
                        a.q("CRL issuer of CRL does not match CRL issuer of distribution point.");
                        return;
                    }
                    z11 = z13;
                }
            } else if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getEncodedIssuerPrincipal(obj))) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            a.q("Cannot find matching CRL issuer for certificate.");
        } catch (IOException e11) {
            throw new AnnotatedException(s.g(e11, new StringBuilder("Exception encoding CRL issuer: ")), e11);
        }
    }

    public static void processCRLB2(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        int i11;
        GeneralName[] names;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                    ArrayList arrayList = new ArrayList();
                    if (distributionPoint2.getType() == 0) {
                        for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                            arrayList.add(generalName);
                        }
                    }
                    if (distributionPoint2.getType() == 1) {
                        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                        try {
                            Enumeration objects = ASN1Sequence.getInstance(PrincipalUtils.getIssuerPrincipal(x509crl)).getObjects();
                            while (objects.hasMoreElements()) {
                                aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                            }
                            aSN1EncodableVector.add(distributionPoint2.getName());
                            arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                        } catch (Exception e5) {
                            a.k("Could not read CRL issuer.", e5);
                            return;
                        }
                    }
                    if (distributionPoint.getDistributionPoint() == null) {
                        if (distributionPoint.getCRLIssuer() == null) {
                            a.q("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                            return;
                        }
                        GeneralName[] names2 = distributionPoint.getCRLIssuer().getNames();
                        while (i11 < names2.length) {
                            i11 = arrayList.contains(names2[i11]) ? 0 : i11 + 1;
                        }
                        a.q("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        return;
                    }
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names3 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            names = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            names = new GeneralName[1];
                            try {
                                names[0] = new GeneralName(PrincipalUtils.getEncodedIssuerPrincipal(obj));
                            } catch (Exception e11) {
                                a.k("Could not read certificate issuer.", e11);
                                return;
                            }
                        }
                        names3 = names;
                        for (int i12 = 0; i12 < names3.length; i12++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names3[i12].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names3[i12] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names3 != null) {
                        while (i11 < names3.length) {
                            i11 = arrayList.contains(names3[i11]) ? 0 : i11 + 1;
                        }
                    }
                    a.q("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    return;
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Extension) obj, BASIC_CONSTRAINTS));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            a.q("CA Cert CRL only contains user certificates.");
                            return;
                        } else if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            a.q("End CRL only contains CA certificates.");
                            return;
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        a.q("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e12) {
                    a.k("Basic constraints extension could not be decoded.", e12);
                }
            }
        } catch (Exception e13) {
            a.k("Issuing distribution point extension could not be decoded.", e13);
        }
    }

    public static void processCRLC(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            a.q("delta CRL has unsupported critical extensions");
            return;
        }
        try {
            String str = ISSUING_DISTRIBUTION_POINT;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!PrincipalUtils.getIssuerPrincipal(x509crl).equals(PrincipalUtils.getIssuerPrincipal(x509crl2))) {
                    a.q("Complete CRL issuer does not match delta CRL issuer.");
                    return;
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        a.q("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                        return;
                    }
                    try {
                        String str2 = AUTHORITY_KEY_IDENTIFIER;
                        ASN1Primitive extensionValue = CertPathValidatorUtilities.getExtensionValue(x509crl2, str2);
                        try {
                            ASN1Primitive extensionValue2 = CertPathValidatorUtilities.getExtensionValue(x509crl, str2);
                            if (extensionValue == null) {
                                a.q("CRL authority key identifier is null.");
                            } else if (extensionValue2 == null) {
                                a.q("Delta CRL authority key identifier is null.");
                            } else {
                                if (extensionValue.equals(extensionValue2)) {
                                    return;
                                }
                                a.q("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e5) {
                            a.k("Authority key identifier extension could not be extracted from delta CRL.", e5);
                        }
                    } catch (AnnotatedException e11) {
                        a.k("Authority key identifier extension could not be extracted from complete CRL.", e11);
                    }
                } catch (Exception e12) {
                    a.k("Issuing distribution point extension from delta CRL could not be decoded.", e12);
                }
            }
        } catch (Exception e13) {
            a.k("Issuing distribution point extension could not be decoded.", e13);
        }
    }

    public static ReasonsMask processCRLD(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(CertPathValidatorUtilities.getExtensionValue(x509crl, ISSUING_DISTRIBUTION_POINT));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                return new ReasonsMask(distributionPoint.getReasons()).intersect(new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
            }
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return ReasonsMask.allReasons;
            }
            return (distributionPoint.getReasons() == null ? ReasonsMask.allReasons : new ReasonsMask(distributionPoint.getReasons())).intersect(issuingDistributionPoint == null ? ReasonsMask.allReasons : new ReasonsMask(issuingDistributionPoint.getOnlySomeReasons()));
        } catch (Exception e5) {
            a.k("Issuing distribution point extension could not be decoded.", e5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set processCRLF(java.security.cert.X509CRL r8, java.lang.Object r9, java.security.cert.X509Certificate r10, java.security.PublicKey r11, org.bouncycastle.jcajce.PKIXExtendedParameters r12, java.util.List r13, org.bouncycastle.jcajce.util.JcaJceHelper r14) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCRLF(java.security.cert.X509CRL, java.lang.Object, java.security.cert.X509Certificate, java.security.PublicKey, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.List, org.bouncycastle.jcajce.util.JcaJceHelper):java.util.Set");
    }

    public static PublicKey processCRLG(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e5 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e11) {
                e5 = e11;
            }
        }
        a.k("Cannot verify CRL.", e5);
        return null;
    }

    public static X509CRL processCRLH(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e5 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e11) {
                e5 = e11;
            }
        }
        if (e5 == null) {
            return null;
        }
        a.k("Cannot verify delta CRL.", e5);
        return null;
    }

    public static void processCRLI(Date date, X509CRL x509crl, Object obj, CertStatus certStatus, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (!pKIXExtendedParameters.isUseDeltasEnabled() || x509crl == null) {
            return;
        }
        CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
    }

    public static void processCRLJ(Date date, X509CRL x509crl, Object obj, CertStatus certStatus) throws AnnotatedException {
        if (certStatus.getCertStatus() == 11) {
            CertPathValidatorUtilities.getCertStatus(date, x509crl, obj, certStatus);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void processCertA(java.security.cert.CertPath r9, org.bouncycastle.jcajce.PKIXExtendedParameters r10, java.util.Date r11, org.bouncycastle.jcajce.PKIXCertRevocationChecker r12, int r13, java.security.PublicKey r14, boolean r15, org.bouncycastle.asn1.x500.X500Name r16, java.security.cert.X509Certificate r17) throws java.security.cert.CertPathValidatorException {
        /*
            r7 = r16
            java.lang.String r1 = "Could not validate certificate: "
            java.util.List r0 = r9.getCertificates()
            java.lang.Object r0 = r0.get(r13)
            r8 = r0
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            if (r15 != 0) goto L20
            java.lang.String r0 = r10.getSigProvider()     // Catch: java.security.GeneralSecurityException -> L19
            org.bouncycastle.jce.provider.CertPathValidatorUtilities.verifyX509Certificate(r8, r14, r0)     // Catch: java.security.GeneralSecurityException -> L19
            goto L20
        L19:
            r0 = move-exception
            java.lang.String r1 = "Could not validate certificate signature."
        L1c:
            org.bouncycastle.jce.provider.a.l(r1, r0, r9, r13)
            return
        L20:
            int r0 = r10.getValidityModel()     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> L99
            java.util.Date r2 = org.bouncycastle.jce.provider.CertPathValidatorUtilities.getValidCertDateFromValidityModel(r11, r0, r9, r13)     // Catch: org.bouncycastle.jce.provider.AnnotatedException -> L99
            r8.checkValidity(r2)     // Catch: java.security.cert.CertificateNotYetValidException -> L6b java.security.cert.CertificateExpiredException -> L82
            if (r12 == 0) goto L3e
            org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters r0 = new org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters
            r3 = r9
            r1 = r10
            r4 = r13
            r6 = r14
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.initialize(r0)
            r12.check(r8)
        L3e:
            org.bouncycastle.asn1.x500.X500Name r0 = org.bouncycastle.jce.provider.PrincipalUtils.getIssuerPrincipal(r8)
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L49
            return
        L49:
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r1 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "IssuerName("
            r2.<init>(r5)
            r2.append(r0)
            java.lang.String r0 = ") does not match SubjectName("
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = ") of signing certificate."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1.<init>(r0, r2, r9, r13)
            throw r1
        L6b:
            r0 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r2 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r2.<init>(r1, r0, r9, r13)
            throw r2
        L82:
            r0 = move-exception
            org.bouncycastle.jce.exception.ExtCertPathValidatorException r2 = new org.bouncycastle.jce.exception.ExtCertPathValidatorException
            java.lang.String r5 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r5)
            java.lang.String r1 = r6.toString()
            r2.<init>(r1, r0, r9, r13)
            throw r2
        L99:
            r0 = move-exception
            java.lang.String r1 = "Could not validate time of certificate."
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.RFC3280CertPathUtilities.processCertA(java.security.cert.CertPath, org.bouncycastle.jcajce.PKIXExtendedParameters, java.util.Date, org.bouncycastle.jcajce.PKIXCertRevocationChecker, int, java.security.PublicKey, boolean, org.bouncycastle.asn1.x500.X500Name, java.security.cert.X509Certificate):void");
    }

    public static void processCertBC(CertPath certPath, int i11, PKIXNameConstraintValidator pKIXNameConstraintValidator, boolean z11) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i12 = size - i11;
        if (!CertPathValidatorUtilities.isSelfIssued(x509Certificate) || (i12 >= size && !z11)) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(PrincipalUtils.getSubjectPrincipal(x509Certificate));
                try {
                    pKIXNameConstraintValidator.checkPermittedDN(aSN1Sequence);
                    pKIXNameConstraintValidator.checkExcludedDN(aSN1Sequence);
                    try {
                        GeneralNames generalNames = GeneralNames.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, SUBJECT_ALTERNATIVE_NAME));
                        RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                        for (int i13 = 0; i13 != rDNs.length; i13++) {
                            GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i13].getFirst().getValue()).getString());
                            try {
                                pKIXNameConstraintValidator.checkPermitted(generalName);
                                pKIXNameConstraintValidator.checkExcluded(generalName);
                            } catch (PKIXNameConstraintValidatorException e5) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e5, certPath, i11);
                            }
                        }
                        if (generalNames != null) {
                            try {
                                GeneralName[] names = generalNames.getNames();
                                for (int i14 = 0; i14 < names.length; i14++) {
                                    try {
                                        pKIXNameConstraintValidator.checkPermitted(names[i14]);
                                        pKIXNameConstraintValidator.checkExcluded(names[i14]);
                                    } catch (PKIXNameConstraintValidatorException e11) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e11, certPath, i11);
                                    }
                                }
                            } catch (Exception e12) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e12, certPath, i11);
                            }
                        }
                    } catch (Exception e13) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e13, certPath, i11);
                    }
                } catch (PKIXNameConstraintValidatorException e14) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e14, certPath, i11);
                }
            } catch (Exception e15) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e15, certPath, i11);
            }
        }
    }

    public static PKIXPolicyNode processCertD(CertPath certPath, int i11, Set set, PKIXPolicyNode pKIXPolicyNode, List[] listArr, int i12, boolean z11) throws CertPathValidatorException {
        String str;
        String id2;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i11);
        int size = certificates.size();
        int i13 = size - i11;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue(x509Certificate, CERTIFICATE_POLICIES));
            if (aSN1Sequence == null || pKIXPolicyNode == null) {
                return null;
            }
            Enumeration objects = aSN1Sequence.getObjects();
            HashSet hashSet = new HashSet();
            while (objects.hasMoreElements()) {
                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                hashSet.add(policyIdentifier.getId());
                if (!ANY_POLICY.equals(policyIdentifier.getId())) {
                    try {
                        Set qualifierSet = CertPathValidatorUtilities.getQualifierSet(policyInformation.getPolicyQualifiers());
                        if (!CertPathValidatorUtilities.processCertD1i(i13, listArr, policyIdentifier, qualifierSet)) {
                            CertPathValidatorUtilities.processCertD1ii(i13, listArr, policyIdentifier, qualifierSet);
                        }
                    } catch (CertPathValidatorException e5) {
                        e = e5;
                        str = "Policy qualifier info set could not be build.";
                        a.l(str, e, certPath, i11);
                        return null;
                    }
                }
            }
            if (set.isEmpty() || set.contains(ANY_POLICY)) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i12 > 0 || ((i13 < size || z11) && CertPathValidatorUtilities.isSelfIssued(x509Certificate))) {
                Enumeration objects2 = aSN1Sequence.getObjects();
                while (true) {
                    if (!objects2.hasMoreElements()) {
                        break;
                    }
                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                    if (ANY_POLICY.equals(policyInformation2.getPolicyIdentifier().getId())) {
                        Set qualifierSet2 = CertPathValidatorUtilities.getQualifierSet(policyInformation2.getPolicyQualifiers());
                        List list = listArr[i13 - 1];
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i14);
                            for (Object obj2 : pKIXPolicyNode2.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    id2 = (String) obj2;
                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                    id2 = ((ASN1ObjectIdentifier) obj2).getId();
                                }
                                String str2 = id2;
                                if (CertPathValidatorUtilities.findValidPolicy(pKIXPolicyNode2.getChildren(), str2) == null) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(str2);
                                    PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i13, hashSet3, pKIXPolicyNode2, qualifierSet2, str2, false);
                                    pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                    listArr[i13].add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
            }
            PKIXPolicyNode pKIXPolicyNodeRemoveChildlessPolicyNodes = CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, i13);
            if (CertPathValidatorUtilities.hasCriticalExtension(x509Certificate, CERTIFICATE_POLICIES)) {
                List list2 = listArr[i13];
                for (int i15 = 0; i15 < list2.size(); i15++) {
                    ((PKIXPolicyNode) list2.get(i15)).setCritical(true);
                }
            }
            return pKIXPolicyNodeRemoveChildlessPolicyNodes;
        } catch (AnnotatedException e11) {
            e = e11;
            str = "Could not read certificate policies extension from certificate.";
        }
    }

    public static PKIXPolicyNode processCertE(CertPath certPath, int i11, PKIXPolicyNode pKIXPolicyNode) throws CertPathValidatorException {
        try {
            if (ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), CERTIFICATE_POLICIES)) == null) {
                return null;
            }
            return pKIXPolicyNode;
        } catch (AnnotatedException e5) {
            a.l("Could not read certificate policies extension from certificate.", e5, certPath, i11);
            return null;
        }
    }

    public static void processCertF(CertPath certPath, int i11, PKIXPolicyNode pKIXPolicyNode, int i12) throws CertPathValidatorException {
        if (i12 > 0 || pKIXPolicyNode != null) {
            return;
        }
        a.l("No valid policy tree found when one expected.", null, certPath, i11);
    }

    public static int wrapupCertA(int i11, X509Certificate x509Certificate) {
        return (CertPathValidatorUtilities.isSelfIssued(x509Certificate) || i11 == 0) ? i11 : i11 - 1;
    }

    public static int wrapupCertB(CertPath certPath, int i11, int i12) throws CertPathValidatorException {
        String str;
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(CertPathValidatorUtilities.getExtensionValue((X509Certificate) certPath.getCertificates().get(i11), POLICY_CONSTRAINTS));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str = "Policy constraints requireExplicitPolicy field could not be decoded.";
                            a.l(str, e, certPath, i11);
                            return 0;
                        }
                    }
                }
            }
            return i12;
        } catch (AnnotatedException e11) {
            e = e11;
            str = "Policy constraints could not be decoded.";
        }
    }

    public static void wrapupCertF(CertPath certPath, int i11, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i11);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e5) {
                throw new ExtCertPathValidatorException(e5.getMessage(), e5, certPath, i11);
            } catch (Exception e11) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e11, certPath, i11);
            }
        }
        if (set.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i11);
    }

    public static PKIXPolicyNode wrapupCertG(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i11, List[] listArr, PKIXPolicyNode pKIXPolicyNode, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode != null) {
            if (!CertPathValidatorUtilities.isAnyPolicy(set)) {
                HashSet<PKIXPolicyNode> hashSet = new HashSet();
                for (List list : listArr) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i12);
                        if (ANY_POLICY.equals(pKIXPolicyNode2.getValidPolicy())) {
                            Iterator children = pKIXPolicyNode2.getChildren();
                            while (children.hasNext()) {
                                PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                                if (!ANY_POLICY.equals(pKIXPolicyNode3.getValidPolicy())) {
                                    hashSet.add(pKIXPolicyNode3);
                                }
                            }
                        }
                    }
                }
                for (PKIXPolicyNode pKIXPolicyNode4 : hashSet) {
                    if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                        pKIXPolicyNode = CertPathValidatorUtilities.removePolicyNode(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                    }
                }
                return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
            }
            if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
                return pKIXPolicyNode;
            }
            if (!set2.isEmpty()) {
                HashSet hashSet2 = new HashSet();
                for (List list2 : listArr) {
                    for (int i13 = 0; i13 < list2.size(); i13++) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i13);
                        if (ANY_POLICY.equals(pKIXPolicyNode5.getValidPolicy())) {
                            Iterator children2 = pKIXPolicyNode5.getChildren();
                            while (children2.hasNext()) {
                                hashSet2.add(children2.next());
                            }
                        }
                    }
                }
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    set2.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
                }
                return CertPathValidatorUtilities.removeChildlessPolicyNodes(pKIXPolicyNode, listArr, size);
            }
        } else if (!pKIXExtendedParameters.isExplicitPolicyRequired()) {
            return null;
        }
        a.l("Explicit policy requested but none available.", null, certPath, i11);
        return null;
    }
}
