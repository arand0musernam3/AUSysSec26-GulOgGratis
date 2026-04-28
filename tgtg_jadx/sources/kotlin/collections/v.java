package kotlin.collections;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class v extends u {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = objArr[i11];
                Object obj2 = objArr2[i11];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!b((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof u70.x) && (obj2 instanceof u70.x)) {
                            if (!Arrays.equals(((u70.x) obj).f40864a, ((u70.x) obj2).f40864a)) {
                            }
                        } else if ((obj instanceof u70.h0) && (obj2 instanceof u70.h0)) {
                            if (!Arrays.equals(((u70.h0) obj).f40840a, ((u70.h0) obj2).f40840a)) {
                            }
                        } else if ((obj instanceof u70.a0) && (obj2 instanceof u70.a0)) {
                            if (!Arrays.equals(((u70.a0) obj).f40828a, ((u70.a0) obj2).f40828a)) {
                            }
                        } else if ((obj instanceof u70.d0) && (obj2 instanceof u70.d0)) {
                            if (!Arrays.equals(((u70.d0) obj).f40835a, ((u70.d0) obj2).f40835a)) {
                            }
                        } else if (!Intrinsics.areEqual(obj, obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
