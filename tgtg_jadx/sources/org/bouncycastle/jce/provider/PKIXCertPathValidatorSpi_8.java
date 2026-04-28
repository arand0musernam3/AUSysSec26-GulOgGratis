package org.bouncycastle.jce.provider;

import j4.s;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m0.i1;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXCertRevocationChecker;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXCertPathValidatorSpi_8 extends CertPathValidatorSpi {
    private final JcaJceHelper helper;
    private final boolean isForCRLCheck;

    public PKIXCertPathValidatorSpi_8(boolean z11) {
        this.helper = new BCJcaJceHelper();
        this.isForCRLCheck = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkCertificate(X509Certificate x509Certificate) throws AnnotatedException {
        if (x509Certificate instanceof BCX509Certificate) {
            try {
            } catch (RuntimeException e5) {
                e = e5;
            }
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            a.k("unable to process TBSCertificate", e);
            return;
        }
        try {
            TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
        } catch (IllegalArgumentException e11) {
            throw new AnnotatedException(e11.getMessage());
        } catch (CertificateEncodingException e12) {
            a.k("unable to process TBSCertificate", e12);
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public PKIXCertPathChecker engineGetRevocationChecker() {
        return new ProvRevocationChecker(this.helper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        List<? extends Certificate> list;
        int i11;
        String str;
        X500Name ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        TrustAnchor trustAnchor;
        PKIXCertRevocationChecker pKIXCertRevocationChecker;
        boolean z11;
        int iPrepareNextCertM;
        ArrayList arrayList;
        HashSet hashSet2;
        CertPath certPath2 = certPath;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException(s.h(PKIXParameters.class, new StringBuilder("Parameters must be a "), " instance."));
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            i1.v("trustAnchors is null, this is not allowed for certification path validation.");
            return null;
        }
        List<? extends Certificate> certificates = certPath2.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath2, -1);
        }
        Date validityDate = CertPathValidatorUtilities.getValidityDate(baseParameters, new Date());
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorFindTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorFindTrustAnchor != null) {
                checkCertificate(trustAnchorFindTrustAnchor.getTrustedCert());
                PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorFindTrustAnchor).build();
                ArrayList arrayList2 = new ArrayList();
                PKIXCertRevocationChecker provRevocationChecker = null;
                for (PKIXCertPathChecker pKIXCertPathChecker : pKIXExtendedParametersBuild.getCertPathCheckers()) {
                    pKIXCertPathChecker.init(false);
                    if (!(pKIXCertPathChecker instanceof PKIXRevocationChecker)) {
                        arrayList2.add(pKIXCertPathChecker);
                    } else {
                        if (provRevocationChecker != null) {
                            throw new CertPathValidatorException("only one PKIXRevocationChecker allowed");
                        }
                        provRevocationChecker = pKIXCertPathChecker instanceof PKIXCertRevocationChecker ? (PKIXCertRevocationChecker) pKIXCertPathChecker : new WrappedRevocationChecker(pKIXCertPathChecker);
                    }
                }
                if (pKIXExtendedParametersBuild.isRevocationEnabled() && provRevocationChecker == null) {
                    provRevocationChecker = new ProvRevocationChecker(this.helper);
                }
                int i12 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    arrayListArr[i13] = new ArrayList();
                }
                HashSet hashSet3 = new HashSet();
                int i14 = 1;
                hashSet3.add(RFC3280CertPathUtilities.ANY_POLICY);
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), RFC3280CertPathUtilities.ANY_POLICY, false);
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                HashSet hashSet4 = new HashSet();
                int i15 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i12;
                int i16 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i12;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i12 = 0;
                }
                X509Certificate trustedCert = trustAnchorFindTrustAnchor.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        ca2 = PrincipalUtils.getCA(trustAnchorFindTrustAnchor);
                        cAPublicKey = trustAnchorFindTrustAnchor.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                        algorithmIdentifier.getAlgorithm();
                        algorithmIdentifier.getParameters();
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            a.l("Target certificate in certification path does not match targetConstraints.", null, certPath2, 0);
                            return null;
                        }
                        int i17 = i15;
                        PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                        int i18 = i17;
                        PublicKey publicKey = cAPublicKey;
                        ArrayList arrayList3 = arrayList2;
                        int size2 = certificates.size() - 1;
                        int i19 = i12;
                        PublicKey publicKey2 = publicKey;
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        int i21 = size;
                        X509Certificate x509Certificate = null;
                        while (size2 >= 0) {
                            int i22 = size - size2;
                            List<? extends Certificate> list2 = certificates;
                            X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                            if (size2 == list2.size() - 1) {
                                trustAnchor = trustAnchorFindTrustAnchor;
                                pKIXCertRevocationChecker = provRevocationChecker;
                                z11 = i14;
                            } else {
                                trustAnchor = trustAnchorFindTrustAnchor;
                                pKIXCertRevocationChecker = provRevocationChecker;
                                z11 = 0;
                            }
                            try {
                                checkCertificate(x509Certificate2);
                                PKIXExtendedParameters pKIXExtendedParameters2 = pKIXExtendedParameters;
                                int i23 = i21;
                                X509Certificate x509Certificate3 = trustedCert;
                                Set set = initialPolicies;
                                int i24 = i18;
                                Date date = validityDate;
                                X500Name x500Name = ca2;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                TrustAnchor trustAnchor2 = trustAnchor;
                                certPath2 = certPath;
                                RFC3280CertPathUtilities.processCertA(certPath2, pKIXExtendedParameters2, date, pKIXCertRevocationChecker, size2, publicKey2, z11, x500Name, x509Certificate3);
                                int i25 = size2;
                                PublicKey publicKey3 = publicKey2;
                                X509Certificate x509Certificate4 = x509Certificate3;
                                PKIXCertRevocationChecker pKIXCertRevocationChecker2 = pKIXCertRevocationChecker;
                                RFC3280CertPathUtilities.processCertBC(certPath2, i25, pKIXNameConstraintValidator, this.isForCRLCheck);
                                HashSet hashSet5 = hashSet4;
                                int i26 = i16;
                                PKIXPolicyNode pKIXPolicyNodeProcessCertE = RFC3280CertPathUtilities.processCertE(certPath2, i25, RFC3280CertPathUtilities.processCertD(certPath2, i25, hashSet5, pKIXPolicyNode2, arrayListArr2, i26, this.isForCRLCheck));
                                RFC3280CertPathUtilities.processCertF(certPath2, i25, pKIXPolicyNodeProcessCertE, i24);
                                if (i22 != size) {
                                    if (x509Certificate2 != null) {
                                        hashSet4 = hashSet5;
                                        int i27 = i14;
                                        if (x509Certificate2.getVersion() == i27) {
                                            if (i22 != i27 || !x509Certificate2.equals(trustAnchor2.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath2, i25);
                                            }
                                        }
                                    } else {
                                        hashSet4 = hashSet5;
                                    }
                                    RFC3280CertPathUtilities.prepareNextCertA(certPath2, i25);
                                    PKIXPolicyNode pKIXPolicyNodePrepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath2, i25, arrayListArr2, pKIXPolicyNodeProcessCertE, i19);
                                    RFC3280CertPathUtilities.prepareNextCertG(certPath2, i25, pKIXNameConstraintValidator);
                                    int iPrepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath2, i25, i24);
                                    int iPrepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath2, i25, i19);
                                    int iPrepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath2, i25, i26);
                                    int iPrepareNextCertI1 = RFC3280CertPathUtilities.prepareNextCertI1(certPath2, i25, iPrepareNextCertH1);
                                    int iPrepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath2, i25, iPrepareNextCertH2);
                                    int iPrepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath2, i25, iPrepareNextCertH3);
                                    RFC3280CertPathUtilities.prepareNextCertK(certPath2, i25);
                                    iPrepareNextCertM = RFC3280CertPathUtilities.prepareNextCertM(certPath2, i25, RFC3280CertPathUtilities.prepareNextCertL(certPath2, i25, i23));
                                    RFC3280CertPathUtilities.prepareNextCertN(certPath2, i25);
                                    Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                                    if (criticalExtensionOIDs != null) {
                                        hashSet2 = new HashSet(criticalExtensionOIDs);
                                        hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                        hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                        hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                        hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                        hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                        hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                        hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                        hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    } else {
                                        hashSet2 = new HashSet();
                                    }
                                    ArrayList arrayList4 = arrayList3;
                                    RFC3280CertPathUtilities.prepareNextCertO(certPath2, i25, hashSet2, arrayList4);
                                    X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate2);
                                    pKIXPolicyNode2 = pKIXPolicyNodePrepareCertB;
                                    try {
                                        PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath2.getCertificates(), i25, this.helper);
                                        AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                        algorithmIdentifier2.getAlgorithm();
                                        algorithmIdentifier2.getParameters();
                                        x509Certificate4 = x509Certificate2;
                                        ca2 = subjectPrincipal;
                                        i18 = iPrepareNextCertI1;
                                        i16 = iPrepareNextCertJ;
                                        publicKey2 = nextWorkingKey;
                                        arrayList = arrayList4;
                                        i19 = iPrepareNextCertI2;
                                        size2 = i25 - 1;
                                        validityDate = date;
                                        arrayListArr = arrayListArr2;
                                        trustAnchorFindTrustAnchor = trustAnchor2;
                                        arrayList3 = arrayList;
                                        i21 = iPrepareNextCertM;
                                        provRevocationChecker = pKIXCertRevocationChecker2;
                                        x509Certificate = x509Certificate2;
                                        initialPolicies = set;
                                        pKIXExtendedParameters = pKIXExtendedParameters2;
                                        certificates = list2;
                                        trustedCert = x509Certificate4;
                                        i14 = 1;
                                    } catch (CertPathValidatorException e5) {
                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e5, certPath2, i25);
                                    }
                                } else {
                                    hashSet4 = hashSet5;
                                }
                                arrayList = arrayList3;
                                iPrepareNextCertM = i23;
                                pKIXPolicyNode2 = pKIXPolicyNodeProcessCertE;
                                i16 = i26;
                                i18 = i24;
                                publicKey2 = publicKey3;
                                ca2 = x500Name;
                                size2 = i25 - 1;
                                validityDate = date;
                                arrayListArr = arrayListArr2;
                                trustAnchorFindTrustAnchor = trustAnchor2;
                                arrayList3 = arrayList;
                                i21 = iPrepareNextCertM;
                                provRevocationChecker = pKIXCertRevocationChecker2;
                                x509Certificate = x509Certificate2;
                                initialPolicies = set;
                                pKIXExtendedParameters = pKIXExtendedParameters2;
                                certificates = list2;
                                trustedCert = x509Certificate4;
                                i14 = 1;
                            } catch (AnnotatedException e11) {
                                throw new CertPathValidatorException(e11.getMessage(), e11.getUnderlyingException(), certPath, size2);
                            }
                        }
                        TrustAnchor trustAnchor3 = trustAnchorFindTrustAnchor;
                        int i28 = size2;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        Set set2 = initialPolicies;
                        PKIXPolicyNode pKIXPolicyNode3 = pKIXPolicyNode2;
                        ArrayList arrayList5 = arrayList3;
                        PKIXExtendedParameters pKIXExtendedParameters3 = pKIXExtendedParameters;
                        int i29 = i28 + 1;
                        int iWrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath2, i29, RFC3280CertPathUtilities.wrapupCertA(i18, x509Certificate));
                        Set<String> criticalExtensionOIDs2 = x509Certificate.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                            hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                            hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                            hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                            hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                            hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                            hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                            hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                            hashSet.remove(Extension.extendedKeyUsage.getId());
                        } else {
                            hashSet = new HashSet();
                        }
                        RFC3280CertPathUtilities.wrapupCertF(certPath2, i29, arrayList5, hashSet);
                        PKIXPolicyNode pKIXPolicyNodeWrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath2, pKIXExtendedParameters3, set2, i29, arrayListArr3, pKIXPolicyNode3, hashSet4);
                        if (iWrapupCertB > 0 || pKIXPolicyNodeWrapupCertG != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor3, pKIXPolicyNodeWrapupCertG, x509Certificate.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath2, i28);
                    } catch (CertPathValidatorException e12) {
                        e = e12;
                        str = "Algorithm identifier of public key of trust anchor could not be read.";
                        i11 = -1;
                        a.l(str, e, certPath2, i11);
                        return null;
                    }
                } catch (RuntimeException e13) {
                    e = e13;
                    i11 = -1;
                    str = "Subject of trust anchor could not be (re)encoded.";
                }
            } else {
                list = certificates;
                try {
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath2, -1);
                } catch (AnnotatedException e14) {
                    e = e14;
                }
            }
        } catch (AnnotatedException e15) {
            e = e15;
            list = certificates;
        }
        throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath2, list.size() - 1);
    }

    public PKIXCertPathValidatorSpi_8() {
        this(false);
    }
}
