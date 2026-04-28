package androidx.media3.muxer;

import e9.a;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MuxerException extends Exception {
    static {
        HashSet hashSet = a.f15872a;
        synchronized (a.class) {
            if (a.f15872a.add("media3.muxer")) {
                a.f15873b += ", media3.muxer";
            }
        }
    }
}
