package lp;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements MediaPlayer.OnErrorListener {
    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
        sa0.a.f38953a.c(r8.k.k("MediaPlayer error: what=", i11, i12, " extra="), new Object[0]);
        return true;
    }
}
