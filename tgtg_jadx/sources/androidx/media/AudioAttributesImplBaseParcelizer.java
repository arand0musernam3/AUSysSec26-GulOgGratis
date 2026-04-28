package androidx.media;

import ra.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3556a = 0;
        audioAttributesImplBase.f3557b = 0;
        audioAttributesImplBase.f3558c = 0;
        audioAttributesImplBase.f3559d = -1;
        audioAttributesImplBase.f3556a = aVar.f(0, 1);
        audioAttributesImplBase.f3557b = aVar.f(audioAttributesImplBase.f3557b, 2);
        audioAttributesImplBase.f3558c = aVar.f(audioAttributesImplBase.f3558c, 3);
        audioAttributesImplBase.f3559d = aVar.f(audioAttributesImplBase.f3559d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f3556a, 1);
        aVar.j(audioAttributesImplBase.f3557b, 2);
        aVar.j(audioAttributesImplBase.f3558c, 3);
        aVar.j(audioAttributesImplBase.f3559d, 4);
    }
}
