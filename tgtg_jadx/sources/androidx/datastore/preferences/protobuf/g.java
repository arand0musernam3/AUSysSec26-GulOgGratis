package androidx.datastore.preferences.protobuf;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2970i = Integer.MAX_VALUE;

    public g(byte[] bArr, int i11, int i12, boolean z11) {
        this.f2964c = bArr;
        this.f2965d = i12 + i11;
        this.f2967f = i11;
        this.f2968g = i11;
    }

    public final int A() throws InvalidProtocolBufferException {
        int i11 = this.f2967f;
        if (this.f2965d - i11 < 4) {
            throw InvalidProtocolBufferException.e();
        }
        this.f2967f = i11 + 4;
        byte[] bArr = this.f2964c;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long B() throws InvalidProtocolBufferException {
        int i11 = this.f2967f;
        if (this.f2965d - i11 < 8) {
            throw InvalidProtocolBufferException.e();
        }
        this.f2967f = i11 + 8;
        byte[] bArr = this.f2964c;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final int C() {
        int i11;
        int i12 = this.f2967f;
        int i13 = this.f2965d;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f2964c;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                this.f2967f = i14;
                return b8;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b8;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b11 = bArr[i19];
                            int i22 = (i21 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f2967f = i15;
                return i11;
            }
        }
        return (int) E();
    }

    public final long D() {
        long j9;
        long j11;
        long j12;
        long j13;
        int i11 = this.f2967f;
        int i12 = this.f2965d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f2964c;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                this.f2967f = i13;
                return b8;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b8;
                if (i15 < 0) {
                    j9 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j9 = i17 ^ 16256;
                        i14 = i16;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            j13 = (-2080896) ^ i19;
                        } else {
                            long j14 = i19;
                            i14 = i11 + 5;
                            long j15 = j14 ^ (((long) bArr[i18]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i18 = i11 + 6;
                                long j16 = j15 ^ (((long) bArr[i14]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i11 + 7;
                                    j15 = j16 ^ (((long) bArr[i18]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i18 = i11 + 8;
                                        j16 = j15 ^ (((long) bArr[i14]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i11 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i14 = i21;
                                                }
                                            }
                                            j9 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j9 = j12 ^ j15;
                        }
                        i14 = i18;
                        j9 = j13;
                    }
                }
                this.f2967f = i14;
                return j9;
            }
        }
        return E();
    }

    public final long E() throws InvalidProtocolBufferException {
        long j9 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f2967f;
            if (i12 == this.f2965d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f2967f = i12 + 1;
            byte b8 = this.f2964c[i12];
            j9 |= ((long) (b8 & ByteCompanionObject.MAX_VALUE)) << i11;
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void F() {
        int i11 = this.f2965d + this.f2966e;
        this.f2965d = i11;
        int i12 = i11 - this.f2968g;
        int i13 = this.f2970i;
        if (i12 <= i13) {
            this.f2966e = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f2966e = i14;
        this.f2965d = i11 - i14;
    }

    public final void G(int i11) throws InvalidProtocolBufferException {
        if (i11 >= 0) {
            int i12 = this.f2965d;
            int i13 = this.f2967f;
            if (i11 <= i12 - i13) {
                this.f2967f = i13 + i11;
                return;
            }
        }
        if (i11 >= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void a(int i11) throws InvalidProtocolBufferException {
        if (this.f2969h != i11) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int b() {
        return this.f2967f - this.f2968g;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean c() {
        return this.f2967f == this.f2965d;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void d(int i11) {
        this.f2970i = i11;
        F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int e(int i11) {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iB = b() + i11;
        if (iB < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i12 = this.f2970i;
        if (iB > i12) {
            throw InvalidProtocolBufferException.e();
        }
        this.f2970i = iB;
        F();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean f() {
        return D() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.datastore.preferences.protobuf.f g() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.C()
            byte[] r1 = r4.f2964c
            if (r0 <= 0) goto L19
            int r2 = r4.f2965d
            int r3 = r4.f2967f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.f r1 = androidx.datastore.preferences.protobuf.f.d(r3, r0, r1)
            int r2 = r4.f2967f
            int r2 = r2 + r0
            r4.f2967f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.f r0 = androidx.datastore.preferences.protobuf.f.f2956c
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f2965d
            int r3 = r4.f2967f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f2967f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.b0.f2931b
        L35:
            androidx.datastore.preferences.protobuf.f r1 = androidx.datastore.preferences.protobuf.f.f2956c
            androidx.datastore.preferences.protobuf.f r1 = new androidx.datastore.preferences.protobuf.f
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.g.g():androidx.datastore.preferences.protobuf.f");
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final double h() {
        return Double.longBitsToDouble(B());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int i() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int j() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long k() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final float l() {
        return Float.intBitsToFloat(A());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int m() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long n() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int o() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long p() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int q() {
        int iC = C();
        return (-(iC & 1)) ^ (iC >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long r() {
        long jD = D();
        return (-(jD & 1)) ^ (jD >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String s() throws InvalidProtocolBufferException {
        int iC = C();
        if (iC > 0) {
            int i11 = this.f2965d;
            int i12 = this.f2967f;
            if (iC <= i11 - i12) {
                String str = new String(this.f2964c, i12, iC, b0.f2930a);
                this.f2967f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String t() throws InvalidProtocolBufferException {
        int iC = C();
        if (iC > 0) {
            int i11 = this.f2965d;
            int i12 = this.f2967f;
            if (iC <= i11 - i12) {
                String strQ = q1.f3043a.q(i12, iC, this.f2964c);
                this.f2967f += iC;
                return strQ;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int u() throws InvalidProtocolBufferException {
        if (c()) {
            this.f2969h = 0;
            return 0;
        }
        int iC = C();
        this.f2969h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int v() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long w() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean x(int i11) throws InvalidProtocolBufferException {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                G(8);
                return true;
            }
            if (i12 == 2) {
                G(C());
                return true;
            }
            if (i12 == 3) {
                y();
                a(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            G(4);
            return true;
        }
        int i14 = this.f2965d - this.f2967f;
        byte[] bArr = this.f2964c;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f2967f;
                this.f2967f = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i13 < 10) {
            int i16 = this.f2967f;
            if (i16 == this.f2965d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f2967f = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }
}
