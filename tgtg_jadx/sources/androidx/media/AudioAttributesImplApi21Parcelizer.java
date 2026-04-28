package androidx.media;

import android.media.AudioAttributes;
import ra.a;
import ra.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3555b = -1;
        audioAttributesImplApi21.f3554a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f3554a, 1);
        audioAttributesImplApi21.f3555b = aVar.f(audioAttributesImplApi21.f3555b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f3554a;
        aVar.i(1);
        ((b) aVar).f37821e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f3555b, 2);
    }
}
