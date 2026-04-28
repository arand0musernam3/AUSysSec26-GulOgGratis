package atd.e;

import android.content.pm.ApplicationInfo;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipFile;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: loaded from: classes.dex */
public class ChallengeResult {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    private static Object CompletionEvent;
    private static long ErrorMessage;
    private static boolean InitializeResult;
    private static byte InitializeResultFailure;
    private static int InitializeResultSuccess;
    public static final Map cancelled;
    private static long getErrorCode;
    private static int getErrorDetails;
    private static long hashCode;
    public static final Map onCompletion;
    private static byte[] protocolError;
    private static Object runtimeError;
    private static byte[] timedout;
    private static int toString;

    private static String $$c(byte b8, short s7, short s8) {
        int i11 = 97 - (s8 * 4);
        int i12 = 4 - (s7 * 3);
        int i13 = b8 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i13 + 21];
        int i14 = i13 + 20;
        int i15 = -1;
        if (bArr == null) {
            int i16 = $16 + 77;
            $17 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 90 / 0;
            }
            i11 = (i11 + (-i14)) - 4;
            i12++;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i11;
            if (i15 == i14) {
                return new String(bArr2, 0);
            }
            byte b11 = bArr[i12];
            $16 = ($17 + 5) % 128;
            i11 = (i11 + (-b11)) - 4;
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, int r7, int r8) {
        /*
            int r0 = atd.e.ChallengeResult.$16
            int r1 = r0 + 105
            int r1 = r1 % 128
            atd.e.ChallengeResult.$17 = r1
            int r8 = 119 - r8
            int r6 = 1161 - r6
            byte[] r1 = atd.e.ChallengeResult.$$d
            int r2 = 36 - r7
            byte[] r2 = new byte[r2]
            int r7 = 35 - r7
            r3 = 0
            if (r1 != 0) goto L27
            int r0 = r0 + 61
            int r0 = r0 % 128
            atd.e.ChallengeResult.$17 = r0
            int r0 = r0 + 39
            int r0 = r0 % 128
            atd.e.ChallengeResult.$16 = r0
            r0 = r7
            r4 = r1
            r1 = r3
            goto L3e
        L27:
            r0 = r3
        L28:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r2[r0] = r4
            if (r0 != r7) goto L35
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r3)
            return r6
        L35:
            int r0 = r0 + 1
            r4 = r1[r6]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r5
        L3e:
            int r8 = -r8
            int r0 = r0 + r8
            int r8 = r0 + (-3)
            r0 = r1
            r1 = r4
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResult.$$f(short, int, int):java.lang.String");
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
            Method dump skipped, instruction units count: 7266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResult.<clinit>():void");
    }

    private ChallengeResult() {
    }

    public static Object AuthenticationRequestParameters(int i11, char c3, int i12) throws Throwable {
        int i13 = $10;
        Object obj = runtimeError;
        $11 = (i13 + 63) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i11), Character.valueOf(c3), Integer.valueOf(i12)};
            byte[] bArr = $$d;
            Class<?> cls = Class.forName($$f((short) 504, bArr[168], bArr[1009]), true, (ClassLoader) CompletionEvent);
            String str$$f = $$f(bArr[182], bArr[1000], bArr[307]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$f, cls2, Character.TYPE, cls2).invoke(obj, objArr);
            $11 = ($10 + 113) % 128;
            return objInvoke;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static URL getDeviceData(String str, ApplicationInfo applicationInfo) throws Throwable {
        char c3;
        char c7;
        try {
            ArrayList<File> arrayList = new ArrayList();
            short s7 = (short) 1158;
            byte[] bArr = $$d;
            short s8 = (short) 1125;
            if (Class.forName($$f(s7, bArr[9], bArr[1009])).getField($$f(s8, bArr[599], bArr[55])).get(applicationInfo) != null) {
                $11 = ($10 + 83) % 128;
                c3 = '\t';
                c7 = 1009;
                Object obj = Class.forName($$f(s7, bArr[9], bArr[1009])).getField($$f(s8, bArr[599], bArr[55])).get(applicationInfo);
                $11 = ($10 + 53) % 128;
                try {
                    arrayList.add(Class.forName($$f((short) 1117, bArr[545], bArr[138])).getDeclaredConstructor(String.class).newInstance(obj));
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } else {
                c3 = '\t';
                c7 = 1009;
            }
            short s11 = (short) 1106;
            if (Class.forName($$f(s7, bArr[c3], bArr[c7])).getField($$f(s11, bArr[429], bArr[55])).get(applicationInfo) != null) {
                int i11 = $11;
                $10 = ((i11 ^ 65) + ((i11 & 65) << 1)) % 128;
                Object[] objArr = (Object[]) Class.forName($$f(s7, bArr[c3], bArr[c7])).getField($$f(s11, bArr[429], bArr[55])).get(applicationInfo);
                int length = objArr.length;
                int i12 = $10;
                $11 = (((i12 | 103) << 1) - (i12 ^ 103)) % 128;
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = {objArr[i13]};
                        byte[] bArr2 = $$d;
                        arrayList.add(Class.forName($$f((short) 1117, bArr2[545], bArr2[138])).getDeclaredConstructor(String.class).newInstance(objArr2));
                        int i14 = i13 + 111;
                        i13 = ((i14 | (-110)) << 1) - (i14 ^ (-110));
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                }
            }
            for (File file : arrayList) {
                $11 = ($10 + 113) % 128;
                short s12 = (short) 1117;
                try {
                    byte[] bArr3 = $$d;
                    if (((Boolean) Class.forName($$f(s12, bArr3[545], bArr3[138])).getMethod($$f((short) 1092, bArr3[2], bArr3[47]), null).invoke(file, null)).booleanValue()) {
                        int i15 = $10;
                        int i16 = ((i15 ^ 49) + ((i15 & 49) << 1)) % 128;
                        $11 = i16;
                        $10 = ((i16 ^ 77) + ((i16 & 77) << 1)) % 128;
                        try {
                            try {
                                if (((String) Class.forName($$f(s12, bArr3[545], bArr3[138])).getMethod($$f((short) 1087, bArr3[425], bArr3[307]), null).invoke(file, null)).endsWith($$f((short) 1081, bArr3[867], (byte) (-bArr3[179])))) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append($$f((short) 1078, bArr3[599], bArr3[138]));
                                    int i17 = $10;
                                    $11 = ((i17 & 39) + (i17 | 39)) % 128;
                                    try {
                                        sb2.append((String) Class.forName($$f(s12, bArr3[545], bArr3[138])).getMethod($$f((short) 1070, bArr3[429], bArr3[307]), null).invoke(file, null));
                                        short s13 = (short) 1056;
                                        sb2.append($$f(s13, bArr3[77], (byte) 86));
                                        sb2.append(str);
                                        try {
                                            URL url = (URL) Class.forName($$f(s13, bArr3[545], bArr3[138])).getDeclaredConstructor(String.class).newInstance(sb2.toString());
                                            ZipFile zipFile = new ZipFile(file);
                                            try {
                                                if (zipFile.getEntry(str.substring(1)) != null) {
                                                    $10 = ($11 + 57) % 128;
                                                    zipFile.close();
                                                    return url;
                                                }
                                                zipFile.close();
                                                int i18 = $10;
                                                $11 = (((i18 | 69) << 1) - (i18 ^ 69)) % 128;
                                            } finally {
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause3 = th4.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th4;
                                        }
                                    } catch (Throwable th5) {
                                        Throwable cause4 = th5.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th5;
                                    }
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        } catch (Throwable th6) {
                            Throwable cause5 = th6.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th6;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th7) {
                    Throwable cause6 = th7.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th7;
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static int getSDKAppID(int i11) throws Throwable {
        int i12 = $11;
        Object obj = runtimeError;
        $10 = ((i12 ^ 1) + ((i12 & 1) << 1)) % 128;
        try {
            int iIntValue = ((Integer) Class.forName($$f((short) 504, r2[168], r2[1009]), true, (ClassLoader) CompletionEvent).getMethod($$f(r2[7], (byte) (-$$d[207]), r2[307]), Integer.TYPE).invoke(obj, Integer.valueOf(i11))).intValue();
            int i13 = $11;
            $10 = ((i13 ^ 63) + ((i13 & 63) << 1)) % 128;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object getSDKTransactionID(int i11) {
        $10 = ($11 + 49) % 128;
        Map map = cancelled;
        int i12 = InitializeResultSuccess;
        Object obj = map.get(Integer.valueOf(((~i11) & i12) | ((~i12) & i11)));
        int i13 = $11;
        $10 = ((i13 ^ 91) + ((i13 & 91) << 1)) % 128;
        return obj;
    }

    public static void init$0() {
        int i11 = $10;
        $$a = new byte[]{101, -35, 43, 28, -24, -3, 8, -1, -13, -10, 7, 2, -2, -23, 7, -10, -3, 24, -23, -16, -8, 12, -18, -5};
        $$b = 62;
        $11 = ((i11 ^ 83) + ((i11 & 83) << 1)) % 128;
    }

    public static void init$1() {
        int i11;
        int i12 = $11 + 5;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            byte[] bArr = new byte[1174];
            System.arraycopy("/ï\u001e_ð\u0007ï\u0000\u0003\u00023Èñþ÷\fô÷C»\u0000<êÎý\u0001\u0000\u0003ÿê\b÷þ\"Ø\u0005ô\u0001÷\u0000\fû\u001eØô\u0006è\u00120Â÷>åÚú\u0004\u0000\u0001\u0000ò\u001eá÷\u0000\fû\u001eØôüê\fóüþÿî#êñ\u0005Êî\u0002\u0006ì5Ñúú\u0004(ÿî0Üì\u0001\u0000ôþ\f\u0012ìê\t\u0006è\u00120½\u0006îCÖ\u0000\u0003ð\u0007ï\u0000\u0003\u00023¶þ\bú;×Ø\u0006\bþ\u000bòòô\rñÿú\u0001\u0004ê!â&×ú\u000bêê\r2Ç3êÊ\tú\u0005\u001eÑþ\u0005úÿ\u0011ýñÿ<Êúè\u0011ô=·\tó\nýþî>ð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAËê\r2Ç3Æ\u0000ý'Ñþ+ûÿ\u0001û\u0000Ìüÿ+Ï1ÿî\u001fêï\u0001÷\u0000\fûÿî0Îý\u0001\u0000\u0003ÿê\b÷þ\"Ø\u0005ôÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôê\r3Éý1Äÿî-Üì\n\u0003û\u001eàê\u0010ê\r3Æ4éÊ\tú\u0005\u001eÑþ\u0005úÿ\u0011ýÿî\u001e\föôß\u000eðø\u000fûì\b÷þ\"\u0002\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðòýú\tÿê\f\u001eØô\nÿìøþ\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðþù\u0007ò\b÷þ\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýê\r2Ç3éØ\u0004òý\u0004ô\u0004ÿ\u0010êïû\u0006õMÀËëý\u000bîþAËê\r2Ç3Ê/û÷\u0002úÏ*\u0004Ì-üúùÔý2\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî\u001e\fö\u0007Îý$\u0002ÿî-Üì\n\u0003û\u001eàê\u0010".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, 1174);
            $$d = bArr;
            i11 = 15391;
        } else {
            byte[] bArr2 = new byte[1174];
            System.arraycopy("/ï\u001e_ð\u0007ï\u0000\u0003\u00023Èñþ÷\fô÷C»\u0000<êÎý\u0001\u0000\u0003ÿê\b÷þ\"Ø\u0005ô\u0001÷\u0000\fû\u001eØô\u0006è\u00120Â÷>åÚú\u0004\u0000\u0001\u0000ò\u001eá÷\u0000\fû\u001eØôüê\fóüþÿî#êñ\u0005Êî\u0002\u0006ì5Ñúú\u0004(ÿî0Üì\u0001\u0000ôþ\f\u0012ìê\t\u0006è\u00120½\u0006îCÖ\u0000\u0003ð\u0007ï\u0000\u0003\u00023¶þ\bú;×Ø\u0006\bþ\u000bòòô\rñÿú\u0001\u0004ê!â&×ú\u000bêê\r2Ç3êÊ\tú\u0005\u001eÑþ\u0005úÿ\u0011ýñÿ<Êúè\u0011ô=·\tó\nýþî>ð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAËê\r2Ç3Æ\u0000ý'Ñþ+ûÿ\u0001û\u0000Ìüÿ+Ï1ÿî\u001fêï\u0001÷\u0000\fûÿî0Îý\u0001\u0000\u0003ÿê\b÷þ\"Ø\u0005ôÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôê\r3Éý1Äÿî-Üì\n\u0003û\u001eàê\u0010ê\r3Æ4éÊ\tú\u0005\u001eÑþ\u0005úÿ\u0011ýÿî\u001e\föôß\u000eðø\u000fûì\b÷þ\"\u0002\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðòýú\tÿê\f\u001eØô\nÿìøþ\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðþù\u0007ò\b÷þ\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýê\r2Ç3éØ\u0004òý\u0004ô\u0004ÿ\u0010êïû\u0006õMÀËëý\u000bîþAËê\r2Ç3Ê/û÷\u0002úÏ*\u0004Ì-üúùÔý2\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHÿî\u001e\fö\u0007Îý$\u0002ÿî-Üì\n\u0003û\u001eàê\u0010".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr2, 0, 1174);
            $$d = bArr2;
            i11 = 241;
        }
        $$e = i11;
    }

    public static Object getDeviceData(int i11, char c3, int i12, int i13, boolean z11, String str, Class[] clsArr) throws Throwable {
        Object method;
        Map map = cancelled;
        Object obj = map.get(Integer.valueOf(i13));
        if (obj != null) {
            int i14 = $11;
            $10 = ((i14 ^ 1) + ((i14 & 1) << 1)) % 128;
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i13);
        Object obj2 = runtimeError;
        try {
            Object[] objArr = {Integer.valueOf(i11), Character.valueOf(c3), Integer.valueOf(i12)};
            byte[] bArr = $$d;
            Class<?> cls = Class.forName($$f((short) 504, bArr[168], bArr[1009]), true, (ClassLoader) CompletionEvent);
            String str$$f = $$f(bArr[182], bArr[1000], bArr[307]);
            Class cls2 = Integer.TYPE;
            Class cls3 = (Class) cls.getMethod(str$$f, cls2, Character.TYPE, cls2).invoke(obj2, objArr);
            if (str == null) {
                if (z11) {
                    int i15 = $11;
                    int i16 = ((i15 | 19) << 1) - (i15 ^ 19);
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cls3.getDeclaredConstructor(clsArr);
                        throw null;
                    }
                    method = cls3.getDeclaredConstructor(clsArr);
                } else {
                    method = cls3.getConstructor(clsArr);
                }
            } else if (clsArr == null) {
                int i17 = $11;
                $10 = ((i17 & 101) + (i17 | 101)) % 128;
                if (z11) {
                    int i18 = ((i17 | 115) << 1) - (i17 ^ 115);
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cls3.getDeclaredField(str);
                        throw null;
                    }
                    method = cls3.getDeclaredField(str);
                } else {
                    method = cls3.getField(str);
                }
            } else if (z11) {
                $11 = ($10 + 117) % 128;
                method = cls3.getDeclaredMethod(str, clsArr);
            } else {
                method = cls3.getMethod(str, clsArr);
                int i19 = $11;
                $10 = ((i19 & 55) + (i19 | 55)) % 128;
            }
            map.put(numValueOf, method);
            int i21 = $11;
            $10 = ((i21 ^ 29) + ((i21 & 29) << 1)) % 128;
            return method;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int getDeviceData(Object obj) throws Throwable {
        int i11 = $10;
        int i12 = (i11 & 79) + (i11 | 79);
        int i13 = i12 % 128;
        $11 = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        Object obj2 = runtimeError;
        $10 = ((i13 & 9) + (i13 | 9)) % 128;
        try {
            byte[] bArr = $$d;
            int iIntValue = ((Integer) Class.forName($$f((short) 504, bArr[168], bArr[1009]), true, (ClassLoader) CompletionEvent).getMethod($$f(bArr[182], bArr[1000], bArr[307]), Object.class).invoke(obj2, obj)).intValue();
            $10 = ($11 + 53) % 128;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
