package gy;

import android.media.MediaCodecList;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f20924c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20925a;

    static {
        int i11 = 0;
        f20923b = new f(i11, 0);
        f20924c = new f(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, int i12) {
        super(i11);
        this.f20925a = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20925a) {
            case 0:
                return new MediaCodecList(1);
            case 1:
                File rootDirectory = Environment.getRootDirectory();
                rootDirectory.getClass();
                String absolutePath = rootDirectory.getAbsolutePath();
                absolutePath.getClass();
                return new StatFs(absolutePath);
            default:
                return new z6.a();
        }
    }
}
