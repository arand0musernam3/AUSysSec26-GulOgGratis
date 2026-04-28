package org.bouncycastle.pqc.jcajce.provider.snova;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.pqc.crypto.snova.SnovaKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaKeyPairGenerator;
import org.bouncycastle.pqc.crypto.snova.SnovaParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.SnovaParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class SnovaKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    SnovaKeyPairGenerator engine;
    boolean initialised;
    SnovaKeyGenerationParameters param;
    SecureRandom random;
    private SnovaParameters snovaParameters;

    public static class SNOVA_24_5_4_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_4_ESK() {
            super(SnovaParameters.SNOVA_24_5_4_ESK);
        }
    }

    public static class SNOVA_24_5_4_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_4_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_24_5_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_24_5_4_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_4_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_24_5_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_24_5_4_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_4_SSK() {
            super(SnovaParameters.SNOVA_24_5_4_SSK);
        }
    }

    public static class SNOVA_24_5_5_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_5_ESK() {
            super(SnovaParameters.SNOVA_24_5_5_ESK);
        }
    }

    public static class SNOVA_24_5_5_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_5_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_24_5_5_SHAKE_ESK);
        }
    }

    public static class SNOVA_24_5_5_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_5_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_24_5_5_SHAKE_SSK);
        }
    }

    public static class SNOVA_24_5_5_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_24_5_5_SSK() {
            super(SnovaParameters.SNOVA_24_5_5_SSK);
        }
    }

    public static class SNOVA_25_8_3_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_25_8_3_ESK() {
            super(SnovaParameters.SNOVA_25_8_3_ESK);
        }
    }

    public static class SNOVA_25_8_3_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_25_8_3_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_25_8_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_25_8_3_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_25_8_3_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_25_8_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_25_8_3_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_25_8_3_SSK() {
            super(SnovaParameters.SNOVA_25_8_3_SSK);
        }
    }

    public static class SNOVA_29_6_5_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_29_6_5_ESK() {
            super(SnovaParameters.SNOVA_29_6_5_ESK);
        }
    }

    public static class SNOVA_29_6_5_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_29_6_5_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_29_6_5_SHAKE_ESK);
        }
    }

    public static class SNOVA_29_6_5_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_29_6_5_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_29_6_5_SHAKE_SSK);
        }
    }

    public static class SNOVA_29_6_5_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_29_6_5_SSK() {
            super(SnovaParameters.SNOVA_29_6_5_SSK);
        }
    }

    public static class SNOVA_37_17_2_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_17_2_ESK() {
            super(SnovaParameters.SNOVA_37_17_2_ESK);
        }
    }

    public static class SNOVA_37_17_2_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_17_2_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_37_17_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_37_17_2_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_17_2_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_37_17_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_37_17_2_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_17_2_SSK() {
            super(SnovaParameters.SNOVA_37_17_2_SSK);
        }
    }

    public static class SNOVA_37_8_4_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_8_4_ESK() {
            super(SnovaParameters.SNOVA_37_8_4_ESK);
        }
    }

    public static class SNOVA_37_8_4_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_8_4_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_37_8_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_37_8_4_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_8_4_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_37_8_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_37_8_4_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_37_8_4_SSK() {
            super(SnovaParameters.SNOVA_37_8_4_SSK);
        }
    }

    public static class SNOVA_49_11_3_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_49_11_3_ESK() {
            super(SnovaParameters.SNOVA_49_11_3_ESK);
        }
    }

    public static class SNOVA_49_11_3_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_49_11_3_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_49_11_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_49_11_3_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_49_11_3_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_49_11_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_49_11_3_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_49_11_3_SSK() {
            super(SnovaParameters.SNOVA_49_11_3_SSK);
        }
    }

    public static class SNOVA_56_25_2_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_56_25_2_ESK() {
            super(SnovaParameters.SNOVA_56_25_2_ESK);
        }
    }

    public static class SNOVA_56_25_2_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_56_25_2_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_56_25_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_56_25_2_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_56_25_2_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_56_25_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_56_25_2_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_56_25_2_SSK() {
            super(SnovaParameters.SNOVA_56_25_2_SSK);
        }
    }

    public static class SNOVA_60_10_4_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_60_10_4_ESK() {
            super(SnovaParameters.SNOVA_60_10_4_ESK);
        }
    }

    public static class SNOVA_60_10_4_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_60_10_4_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_60_10_4_SHAKE_ESK);
        }
    }

    public static class SNOVA_60_10_4_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_60_10_4_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_60_10_4_SHAKE_SSK);
        }
    }

    public static class SNOVA_60_10_4_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_60_10_4_SSK() {
            super(SnovaParameters.SNOVA_60_10_4_SSK);
        }
    }

    public static class SNOVA_66_15_3_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_66_15_3_ESK() {
            super(SnovaParameters.SNOVA_66_15_3_ESK);
        }
    }

    public static class SNOVA_66_15_3_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_66_15_3_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_66_15_3_SHAKE_ESK);
        }
    }

    public static class SNOVA_66_15_3_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_66_15_3_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_66_15_3_SHAKE_SSK);
        }
    }

    public static class SNOVA_66_15_3_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_66_15_3_SSK() {
            super(SnovaParameters.SNOVA_66_15_3_SSK);
        }
    }

    public static class SNOVA_75_33_2_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_75_33_2_ESK() {
            super(SnovaParameters.SNOVA_75_33_2_ESK);
        }
    }

    public static class SNOVA_75_33_2_SHAKE_ESK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_75_33_2_SHAKE_ESK() {
            super(SnovaParameters.SNOVA_75_33_2_SHAKE_ESK);
        }
    }

    public static class SNOVA_75_33_2_SHAKE_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_75_33_2_SHAKE_SSK() {
            super(SnovaParameters.SNOVA_75_33_2_SHAKE_SSK);
        }
    }

    public static class SNOVA_75_33_2_SSK extends SnovaKeyPairGeneratorSpi {
        public SNOVA_75_33_2_SSK() {
            super(SnovaParameters.SNOVA_75_33_2_SSK);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        SnovaParameters snovaParameters = SnovaParameters.SNOVA_24_5_4_SSK;
        map.put("SNOVA_24_5_4_SSK", snovaParameters);
        Map map2 = parameters;
        SnovaParameters snovaParameters2 = SnovaParameters.SNOVA_24_5_4_ESK;
        map2.put("SNOVA_24_5_4_ESK", snovaParameters2);
        Map map3 = parameters;
        SnovaParameters snovaParameters3 = SnovaParameters.SNOVA_24_5_4_SHAKE_SSK;
        map3.put("SNOVA_24_5_4_SHAKE_SSK", snovaParameters3);
        Map map4 = parameters;
        SnovaParameters snovaParameters4 = SnovaParameters.SNOVA_24_5_4_SHAKE_ESK;
        map4.put("SNOVA_24_5_4_SHAKE_ESK", snovaParameters4);
        Map map5 = parameters;
        SnovaParameters snovaParameters5 = SnovaParameters.SNOVA_24_5_5_SSK;
        map5.put("SNOVA_24_5_5_SSK", snovaParameters5);
        Map map6 = parameters;
        SnovaParameters snovaParameters6 = SnovaParameters.SNOVA_24_5_5_ESK;
        map6.put("SNOVA_24_5_5_ESK", snovaParameters6);
        Map map7 = parameters;
        SnovaParameters snovaParameters7 = SnovaParameters.SNOVA_24_5_5_SHAKE_SSK;
        map7.put("SNOVA_24_5_5_SHAKE_SSK", snovaParameters7);
        Map map8 = parameters;
        SnovaParameters snovaParameters8 = SnovaParameters.SNOVA_24_5_5_SHAKE_ESK;
        map8.put("SNOVA_24_5_5_SHAKE_ESK", snovaParameters8);
        Map map9 = parameters;
        SnovaParameters snovaParameters9 = SnovaParameters.SNOVA_25_8_3_SSK;
        map9.put("SNOVA_25_8_3_SSK", snovaParameters9);
        Map map10 = parameters;
        SnovaParameters snovaParameters10 = SnovaParameters.SNOVA_25_8_3_ESK;
        map10.put("SNOVA_25_8_3_ESK", snovaParameters10);
        Map map11 = parameters;
        SnovaParameters snovaParameters11 = SnovaParameters.SNOVA_25_8_3_SHAKE_SSK;
        map11.put("SNOVA_25_8_3_SHAKE_SSK", snovaParameters11);
        Map map12 = parameters;
        SnovaParameters snovaParameters12 = SnovaParameters.SNOVA_25_8_3_SHAKE_ESK;
        map12.put("SNOVA_25_8_3_SHAKE_ESK", snovaParameters12);
        Map map13 = parameters;
        SnovaParameters snovaParameters13 = SnovaParameters.SNOVA_29_6_5_SSK;
        map13.put("SNOVA_29_6_5_SSK", snovaParameters13);
        Map map14 = parameters;
        SnovaParameters snovaParameters14 = SnovaParameters.SNOVA_29_6_5_ESK;
        map14.put("SNOVA_29_6_5_ESK", snovaParameters14);
        Map map15 = parameters;
        SnovaParameters snovaParameters15 = SnovaParameters.SNOVA_29_6_5_SHAKE_SSK;
        map15.put("SNOVA_29_6_5_SHAKE_SSK", snovaParameters15);
        Map map16 = parameters;
        SnovaParameters snovaParameters16 = SnovaParameters.SNOVA_29_6_5_SHAKE_ESK;
        map16.put("SNOVA_29_6_5_SHAKE_ESK", snovaParameters16);
        Map map17 = parameters;
        SnovaParameters snovaParameters17 = SnovaParameters.SNOVA_37_8_4_SSK;
        map17.put("SNOVA_37_8_4_SSK", snovaParameters17);
        Map map18 = parameters;
        SnovaParameters snovaParameters18 = SnovaParameters.SNOVA_37_8_4_ESK;
        map18.put("SNOVA_37_8_4_ESK", snovaParameters18);
        Map map19 = parameters;
        SnovaParameters snovaParameters19 = SnovaParameters.SNOVA_37_8_4_SHAKE_SSK;
        map19.put("SNOVA_37_8_4_SHAKE_SSK", snovaParameters19);
        Map map20 = parameters;
        SnovaParameters snovaParameters20 = SnovaParameters.SNOVA_37_8_4_SHAKE_ESK;
        map20.put("SNOVA_37_8_4_SHAKE_ESK", snovaParameters20);
        Map map21 = parameters;
        SnovaParameters snovaParameters21 = SnovaParameters.SNOVA_37_17_2_SSK;
        map21.put("SNOVA_37_17_2_SSK", snovaParameters21);
        Map map22 = parameters;
        SnovaParameters snovaParameters22 = SnovaParameters.SNOVA_37_17_2_ESK;
        map22.put("SNOVA_37_17_2_ESK", snovaParameters22);
        Map map23 = parameters;
        SnovaParameters snovaParameters23 = SnovaParameters.SNOVA_37_17_2_SHAKE_SSK;
        map23.put("SNOVA_37_17_2_SHAKE_SSK", snovaParameters23);
        Map map24 = parameters;
        SnovaParameters snovaParameters24 = SnovaParameters.SNOVA_37_17_2_SHAKE_ESK;
        map24.put("SNOVA_37_17_2_SHAKE_ESK", snovaParameters24);
        Map map25 = parameters;
        SnovaParameters snovaParameters25 = SnovaParameters.SNOVA_49_11_3_SSK;
        map25.put("SNOVA_49_11_3_SSK", snovaParameters25);
        Map map26 = parameters;
        SnovaParameters snovaParameters26 = SnovaParameters.SNOVA_49_11_3_ESK;
        map26.put("SNOVA_49_11_3_ESK", snovaParameters26);
        Map map27 = parameters;
        SnovaParameters snovaParameters27 = SnovaParameters.SNOVA_49_11_3_SHAKE_SSK;
        map27.put("SNOVA_49_11_3_SHAKE_SSK", snovaParameters27);
        Map map28 = parameters;
        SnovaParameters snovaParameters28 = SnovaParameters.SNOVA_49_11_3_SHAKE_ESK;
        map28.put("SNOVA_49_11_3_SHAKE_ESK", snovaParameters28);
        Map map29 = parameters;
        SnovaParameters snovaParameters29 = SnovaParameters.SNOVA_56_25_2_SSK;
        map29.put("SNOVA_56_25_2_SSK", snovaParameters29);
        Map map30 = parameters;
        SnovaParameters snovaParameters30 = SnovaParameters.SNOVA_56_25_2_ESK;
        map30.put("SNOVA_56_25_2_ESK", snovaParameters30);
        Map map31 = parameters;
        SnovaParameters snovaParameters31 = SnovaParameters.SNOVA_56_25_2_SHAKE_SSK;
        map31.put("SNOVA_56_25_2_SHAKE_SSK", snovaParameters31);
        Map map32 = parameters;
        SnovaParameters snovaParameters32 = SnovaParameters.SNOVA_56_25_2_SHAKE_ESK;
        map32.put("SNOVA_56_25_2_SHAKE_ESK", snovaParameters32);
        Map map33 = parameters;
        SnovaParameters snovaParameters33 = SnovaParameters.SNOVA_60_10_4_SSK;
        map33.put("SNOVA_60_10_4_SSK", snovaParameters33);
        Map map34 = parameters;
        SnovaParameters snovaParameters34 = SnovaParameters.SNOVA_60_10_4_ESK;
        map34.put("SNOVA_60_10_4_ESK", snovaParameters34);
        Map map35 = parameters;
        SnovaParameters snovaParameters35 = SnovaParameters.SNOVA_60_10_4_SHAKE_SSK;
        map35.put("SNOVA_60_10_4_SHAKE_SSK", snovaParameters35);
        Map map36 = parameters;
        SnovaParameters snovaParameters36 = SnovaParameters.SNOVA_60_10_4_SHAKE_ESK;
        map36.put("SNOVA_60_10_4_SHAKE_ESK", snovaParameters36);
        Map map37 = parameters;
        SnovaParameters snovaParameters37 = SnovaParameters.SNOVA_66_15_3_SSK;
        map37.put("SNOVA_66_15_3_SSK", snovaParameters37);
        Map map38 = parameters;
        SnovaParameters snovaParameters38 = SnovaParameters.SNOVA_66_15_3_ESK;
        map38.put("SNOVA_66_15_3_ESK", snovaParameters38);
        Map map39 = parameters;
        SnovaParameters snovaParameters39 = SnovaParameters.SNOVA_66_15_3_SHAKE_SSK;
        map39.put("SNOVA_66_15_3_SHAKE_SSK", snovaParameters39);
        Map map40 = parameters;
        SnovaParameters snovaParameters40 = SnovaParameters.SNOVA_66_15_3_SHAKE_ESK;
        map40.put("SNOVA_66_15_3_SHAKE_ESK", snovaParameters40);
        Map map41 = parameters;
        SnovaParameters snovaParameters41 = SnovaParameters.SNOVA_75_33_2_SSK;
        map41.put("SNOVA_75_33_2_SSK", snovaParameters41);
        Map map42 = parameters;
        SnovaParameters snovaParameters42 = SnovaParameters.SNOVA_75_33_2_ESK;
        map42.put("SNOVA_75_33_2_ESK", snovaParameters42);
        Map map43 = parameters;
        SnovaParameters snovaParameters43 = SnovaParameters.SNOVA_75_33_2_SHAKE_SSK;
        map43.put("SNOVA_75_33_2_SHAKE_SSK", snovaParameters43);
        Map map44 = parameters;
        SnovaParameters snovaParameters44 = SnovaParameters.SNOVA_75_33_2_SHAKE_ESK;
        map44.put("SNOVA_75_33_2_SHAKE_ESK", snovaParameters44);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_4_SSK.getName(), snovaParameters);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_4_ESK.getName(), snovaParameters2);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_4_SHAKE_SSK.getName(), snovaParameters3);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_4_SHAKE_ESK.getName(), snovaParameters4);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_5_SSK.getName(), snovaParameters5);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_5_ESK.getName(), snovaParameters6);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_5_SHAKE_SSK.getName(), snovaParameters7);
        parameters.put(SnovaParameterSpec.SNOVA_24_5_5_SHAKE_ESK.getName(), snovaParameters8);
        parameters.put(SnovaParameterSpec.SNOVA_25_8_3_SSK.getName(), snovaParameters9);
        parameters.put(SnovaParameterSpec.SNOVA_25_8_3_ESK.getName(), snovaParameters10);
        parameters.put(SnovaParameterSpec.SNOVA_25_8_3_SHAKE_SSK.getName(), snovaParameters11);
        parameters.put(SnovaParameterSpec.SNOVA_25_8_3_SHAKE_ESK.getName(), snovaParameters12);
        parameters.put(SnovaParameterSpec.SNOVA_29_6_5_SSK.getName(), snovaParameters13);
        parameters.put(SnovaParameterSpec.SNOVA_29_6_5_ESK.getName(), snovaParameters14);
        parameters.put(SnovaParameterSpec.SNOVA_29_6_5_SHAKE_SSK.getName(), snovaParameters15);
        parameters.put(SnovaParameterSpec.SNOVA_29_6_5_SHAKE_ESK.getName(), snovaParameters16);
        parameters.put(SnovaParameterSpec.SNOVA_37_8_4_SSK.getName(), snovaParameters17);
        parameters.put(SnovaParameterSpec.SNOVA_37_8_4_ESK.getName(), snovaParameters18);
        parameters.put(SnovaParameterSpec.SNOVA_37_8_4_SHAKE_SSK.getName(), snovaParameters19);
        parameters.put(SnovaParameterSpec.SNOVA_37_8_4_SHAKE_ESK.getName(), snovaParameters20);
        parameters.put(SnovaParameterSpec.SNOVA_37_17_2_SSK.getName(), snovaParameters21);
        parameters.put(SnovaParameterSpec.SNOVA_37_17_2_ESK.getName(), snovaParameters22);
        parameters.put(SnovaParameterSpec.SNOVA_37_17_2_SHAKE_SSK.getName(), snovaParameters23);
        parameters.put(SnovaParameterSpec.SNOVA_37_17_2_SHAKE_ESK.getName(), snovaParameters24);
        parameters.put(SnovaParameterSpec.SNOVA_49_11_3_SSK.getName(), snovaParameters25);
        parameters.put(SnovaParameterSpec.SNOVA_49_11_3_ESK.getName(), snovaParameters26);
        parameters.put(SnovaParameterSpec.SNOVA_49_11_3_SHAKE_SSK.getName(), snovaParameters27);
        parameters.put(SnovaParameterSpec.SNOVA_49_11_3_SHAKE_ESK.getName(), snovaParameters28);
        parameters.put(SnovaParameterSpec.SNOVA_56_25_2_SSK.getName(), snovaParameters29);
        parameters.put(SnovaParameterSpec.SNOVA_56_25_2_ESK.getName(), snovaParameters30);
        parameters.put(SnovaParameterSpec.SNOVA_56_25_2_SHAKE_SSK.getName(), snovaParameters31);
        parameters.put(SnovaParameterSpec.SNOVA_56_25_2_SHAKE_ESK.getName(), snovaParameters32);
        parameters.put(SnovaParameterSpec.SNOVA_60_10_4_SSK.getName(), snovaParameters33);
        parameters.put(SnovaParameterSpec.SNOVA_60_10_4_ESK.getName(), snovaParameters34);
        parameters.put(SnovaParameterSpec.SNOVA_60_10_4_SHAKE_SSK.getName(), snovaParameters35);
        parameters.put(SnovaParameterSpec.SNOVA_60_10_4_SHAKE_ESK.getName(), snovaParameters36);
        parameters.put(SnovaParameterSpec.SNOVA_66_15_3_SSK.getName(), snovaParameters37);
        parameters.put(SnovaParameterSpec.SNOVA_66_15_3_ESK.getName(), snovaParameters38);
        parameters.put(SnovaParameterSpec.SNOVA_66_15_3_SHAKE_SSK.getName(), snovaParameters39);
        parameters.put(SnovaParameterSpec.SNOVA_66_15_3_SHAKE_ESK.getName(), snovaParameters40);
        parameters.put(SnovaParameterSpec.SNOVA_75_33_2_SSK.getName(), snovaParameters41);
        parameters.put(SnovaParameterSpec.SNOVA_75_33_2_ESK.getName(), snovaParameters42);
        parameters.put(SnovaParameterSpec.SNOVA_75_33_2_SHAKE_SSK.getName(), snovaParameters43);
        parameters.put(SnovaParameterSpec.SNOVA_75_33_2_SHAKE_ESK.getName(), snovaParameters44);
    }

    public SnovaKeyPairGeneratorSpi(SnovaParameters snovaParameters) {
        super(snovaParameters.getName());
        this.engine = new SnovaKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.snovaParameters = snovaParameters;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof SnovaParameterSpec ? ((SnovaParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            SnovaKeyGenerationParameters snovaKeyGenerationParameters = new SnovaKeyGenerationParameters(this.random, SnovaParameters.SNOVA_24_5_4_SSK);
            this.param = snovaKeyGenerationParameters;
            this.engine.init(snovaKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCSnovaPublicKey((SnovaPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCSnovaPrivateKey((SnovaPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(a.g("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        SnovaKeyGenerationParameters snovaKeyGenerationParameters = new SnovaKeyGenerationParameters(secureRandom, (SnovaParameters) parameters.get(nameFromParams));
        this.param = snovaKeyGenerationParameters;
        this.engine.init(snovaKeyGenerationParameters);
        this.initialised = true;
    }

    public SnovaKeyPairGeneratorSpi() {
        super("Snova");
        this.engine = new SnovaKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i11, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
