package com.appsflyer.internal;

import java.util.Map;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: loaded from: classes2.dex */
public class AFa1kSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventType;
    private static int afDebugLog;
    private static long afErrorLog;
    private static int afInfoLog;
    private static int afLogForce;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f9508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f9509e;
    private static long force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f9510i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f9511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Object f9512w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0035 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, byte r9) {
        /*
            byte[] r0 = com.appsflyer.internal.AFa1kSDK.$$a
            int r9 = r9 + 1
            int r8 = 119 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            int r3 = com.appsflyer.internal.AFa1kSDK.$13
            int r3 = r3 + 65
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1kSDK.$12 = r3
            r3 = r8
            r5 = r2
            r8 = r7
            goto L3a
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L35
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            int r8 = com.appsflyer.internal.AFa1kSDK.$12
            int r8 = r8 + 71
            int r9 = r8 % 128
            com.appsflyer.internal.AFa1kSDK.$13 = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L33
            return r7
        L33:
            r7 = 0
            throw r7
        L35:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L3a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r8 = r8 + 1
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.$$c(int, byte, byte):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instruction units count: 6976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1kSDK.<clinit>():void");
    }

    private AFa1kSDK() {
    }

    public static Object getMediationNetwork(char c3, int i11, int i12) throws Throwable {
        int i13 = $10 + 33;
        int i14 = i13 % 128;
        $11 = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = f9512w;
        $10 = ((i14 & 109) + (i14 | 109)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c3), Integer.valueOf(i11), Integer.valueOf(i12)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((short) 563, bArr[200], bArr[175]), true, (ClassLoader) f9509e);
            String str$$c = $$c((short) 595, (byte) (-bArr[188]), bArr[43]);
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            return cls.getMethod(str$$c, cls2, cls3, cls3).invoke(obj, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void getMonetizationNetwork(int i11, int i12) {
        int i13 = $10 + 67;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static int getRevenue(int i11) throws Throwable {
        int i12 = $10;
        int i13 = (i12 ^ 91) + ((i12 & 91) << 1);
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = f9512w;
        int i14 = ((i12 & 95) + (i12 | 95)) % 128;
        $11 = i14;
        $10 = (((i14 | 25) << 1) - (i14 ^ 25)) % 128;
        try {
            int iIntValue = ((Integer) Class.forName($$c((short) 563, r2[200], r2[175]), true, (ClassLoader) f9509e).getMethod($$c((short) 595, (byte) (-$$a[188]), r2[43]), Integer.TYPE).invoke(obj, Integer.valueOf(i11))).intValue();
            int i15 = $11 + 115;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 11 / 0;
            }
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        int i11;
        int i12 = $10 + 97;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            byte[] bArr = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, 1153);
            $$a = bArr;
            i11 = 24963;
        } else {
            byte[] bArr2 = new byte[1153];
            System.arraycopy("j¢®Pò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\n\u0004ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<ú\u0002Ë1úÿÓý5Í/Ë-ÿþ\u0000Ö3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÚ9¼ \u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿú\u0004Ü\u0011ìî\u0010öø\u000f âì\u0012\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Å\u0017\u000eø&¯Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<úÍ\u0002+\u0005þù\u0003ÿÑ,Ð3ø\u0006öÖ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0001ð0Í\u0002ÿ\fö\né/Õ\u0003:\u0001\u0000ùóÓ\nþ".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr2, 0, 1153);
            $$a = bArr2;
            i11 = 172;
        }
        $$b = i11;
    }

    public static int getMediationNetwork(Object obj) throws Throwable {
        int i11 = $10;
        Object obj2 = f9512w;
        int i12 = ((i11 & 53) + (i11 | 53)) % 128;
        $11 = i12;
        $10 = (i12 + 33) % 128;
        try {
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c((short) 563, bArr[200], bArr[175]), true, (ClassLoader) f9509e).getMethod($$c((short) 1128, bArr[13], bArr[282]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
