package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.Set;
import m0.i1;
import org.bouncycastle.crypto.CryptoServiceProperties;

/* JADX INFO: loaded from: classes3.dex */
public class BitsOfSecurityConstraint extends ServicesConstraint {
    private final int requiredBitsOfSecurity;

    public BitsOfSecurityConstraint(int i11) {
        super(Collections.EMPTY_SET);
        this.requiredBitsOfSecurity = i11;
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (!isException(cryptoServiceProperties.getServiceName()) && cryptoServiceProperties.bitsOfSecurity() < this.requiredBitsOfSecurity) {
            i1.o(this.requiredBitsOfSecurity, cryptoServiceProperties.bitsOfSecurity());
        }
    }

    public BitsOfSecurityConstraint(int i11, Set<String> set) {
        super(set);
        this.requiredBitsOfSecurity = i11;
    }
}
