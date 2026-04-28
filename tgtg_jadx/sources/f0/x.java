package f0;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ InputConfiguration b(int i11, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i11);
    }

    public static /* synthetic */ MultiResolutionStreamInfo c(int i11, int i12, String str) {
        return new MultiResolutionStreamInfo(i11, i12, str);
    }

    public static /* synthetic */ ContentInfo.Builder d(ClipData clipData, int i11) {
        return new ContentInfo.Builder(clipData, i11);
    }

    public static /* synthetic */ void e() {
    }
}
