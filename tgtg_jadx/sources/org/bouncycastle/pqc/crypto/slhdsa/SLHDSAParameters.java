package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngine;

/* JADX INFO: loaded from: classes3.dex */
public class SLHDSAParameters {
    public static final int TYPE_PURE = 0;
    public static final int TYPE_SHA2_256 = 1;
    public static final int TYPE_SHA2_512 = 2;
    public static final int TYPE_SHAKE128 = 3;
    public static final int TYPE_SHAKE256 = 4;
    private final SLHDSAEngineProvider engineProvider;
    private final String name;
    private final int preHashDigest;
    public static final SLHDSAParameters sha2_128f = new SLHDSAParameters("sha2-128f", new Sha2EngineProvider(16, 16, 22, 6, 33, 66), 0);
    public static final SLHDSAParameters sha2_128s = new SLHDSAParameters("sha2-128s", new Sha2EngineProvider(16, 16, 7, 12, 14, 63), 0);
    public static final SLHDSAParameters sha2_192f = new SLHDSAParameters("sha2-192f", new Sha2EngineProvider(24, 16, 22, 8, 33, 66), 0);
    public static final SLHDSAParameters sha2_192s = new SLHDSAParameters("sha2-192s", new Sha2EngineProvider(24, 16, 7, 14, 17, 63), 0);
    public static final SLHDSAParameters sha2_256f = new SLHDSAParameters("sha2-256f", new Sha2EngineProvider(32, 16, 17, 9, 35, 68), 0);
    public static final SLHDSAParameters sha2_256s = new SLHDSAParameters("sha2-256s", new Sha2EngineProvider(32, 16, 8, 14, 22, 64), 0);
    public static final SLHDSAParameters shake_128f = new SLHDSAParameters("shake-128f", new Shake256EngineProvider(16, 16, 22, 6, 33, 66), 0);
    public static final SLHDSAParameters shake_128s = new SLHDSAParameters("shake-128s", new Shake256EngineProvider(16, 16, 7, 12, 14, 63), 0);
    public static final SLHDSAParameters shake_192f = new SLHDSAParameters("shake-192f", new Shake256EngineProvider(24, 16, 22, 8, 33, 66), 0);
    public static final SLHDSAParameters shake_192s = new SLHDSAParameters("shake-192s", new Shake256EngineProvider(24, 16, 7, 14, 17, 63), 0);
    public static final SLHDSAParameters shake_256f = new SLHDSAParameters("shake-256f", new Shake256EngineProvider(32, 16, 17, 9, 35, 68), 0);
    public static final SLHDSAParameters shake_256s = new SLHDSAParameters("shake-256s", new Shake256EngineProvider(32, 16, 8, 14, 22, 64), 0);
    public static final SLHDSAParameters sha2_128f_with_sha256 = new SLHDSAParameters("sha2-128f-with-sha256", new Sha2EngineProvider(16, 16, 22, 6, 33, 66), 1);
    public static final SLHDSAParameters sha2_128s_with_sha256 = new SLHDSAParameters("sha2-128s-with-sha256", new Sha2EngineProvider(16, 16, 7, 12, 14, 63), 1);
    public static final SLHDSAParameters sha2_192f_with_sha512 = new SLHDSAParameters("sha2-192f-with-sha512", new Sha2EngineProvider(24, 16, 22, 8, 33, 66), 2);
    public static final SLHDSAParameters sha2_192s_with_sha512 = new SLHDSAParameters("sha2-192s-with-sha512", new Sha2EngineProvider(24, 16, 7, 14, 17, 63), 2);
    public static final SLHDSAParameters sha2_256f_with_sha512 = new SLHDSAParameters("sha2-256f-with-sha512", new Sha2EngineProvider(32, 16, 17, 9, 35, 68), 2);
    public static final SLHDSAParameters sha2_256s_with_sha512 = new SLHDSAParameters("sha2-256s-with-sha512", new Sha2EngineProvider(32, 16, 8, 14, 22, 64), 2);
    public static final SLHDSAParameters shake_128f_with_shake128 = new SLHDSAParameters("shake-128f-with-shake128", new Shake256EngineProvider(16, 16, 22, 6, 33, 66), 3);
    public static final SLHDSAParameters shake_128s_with_shake128 = new SLHDSAParameters("shake-128s-with-shake128", new Shake256EngineProvider(16, 16, 7, 12, 14, 63), 3);
    public static final SLHDSAParameters shake_192f_with_shake256 = new SLHDSAParameters("shake-192f-with-shake256", new Shake256EngineProvider(24, 16, 22, 8, 33, 66), 4);
    public static final SLHDSAParameters shake_192s_with_shake256 = new SLHDSAParameters("shake-192s-with-shake256", new Shake256EngineProvider(24, 16, 7, 14, 17, 63), 4);
    public static final SLHDSAParameters shake_256f_with_shake256 = new SLHDSAParameters("shake-256f-with-shake256", new Shake256EngineProvider(32, 16, 17, 9, 35, 68), 4);
    public static final SLHDSAParameters shake_256s_with_shake256 = new SLHDSAParameters("shake-256s-with-shake256", new Shake256EngineProvider(32, 16, 8, 14, 22, 64), 4);

    public static class Sha2EngineProvider implements SLHDSAEngineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f33596a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f33597d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f33598h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f33599k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f33600n;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f33601w;

        public Sha2EngineProvider(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f33600n = i11;
            this.f33601w = i12;
            this.f33597d = i13;
            this.f33596a = i14;
            this.f33599k = i15;
            this.f33598h = i16;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public SLHDSAEngine get() {
            return new SLHDSAEngine.Sha2Engine(this.f33600n, this.f33601w, this.f33597d, this.f33596a, this.f33599k, this.f33598h);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public int getN() {
            return this.f33600n;
        }
    }

    public static class Shake256EngineProvider implements SLHDSAEngineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f33602a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f33603d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f33604h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f33605k;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f33606n;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f33607w;

        public Shake256EngineProvider(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f33606n = i11;
            this.f33607w = i12;
            this.f33603d = i13;
            this.f33602a = i14;
            this.f33605k = i15;
            this.f33604h = i16;
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public SLHDSAEngine get() {
            return new SLHDSAEngine.Shake256Engine(this.f33606n, this.f33607w, this.f33603d, this.f33602a, this.f33605k, this.f33604h);
        }

        @Override // org.bouncycastle.pqc.crypto.slhdsa.SLHDSAEngineProvider
        public int getN() {
            return this.f33606n;
        }
    }

    private SLHDSAParameters(String str, SLHDSAEngineProvider sLHDSAEngineProvider, int i11) {
        this.name = str;
        this.engineProvider = sLHDSAEngineProvider;
        this.preHashDigest = i11;
    }

    public SLHDSAEngine getEngine() {
        return this.engineProvider.get();
    }

    public int getN() {
        return this.engineProvider.getN();
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.preHashDigest;
    }

    public boolean isPreHash() {
        return this.preHashDigest != 0;
    }
}
