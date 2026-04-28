package zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessageJwtDecoder_Factory implements c {
    private final c jsonProvider;

    private ProactiveMessageJwtDecoder_Factory(c cVar) {
        this.jsonProvider = cVar;
    }

    public static ProactiveMessageJwtDecoder_Factory create(c cVar) {
        return new ProactiveMessageJwtDecoder_Factory(cVar);
    }

    public static ProactiveMessageJwtDecoder newInstance(n90.c cVar) {
        return new ProactiveMessageJwtDecoder(cVar);
    }

    @Override // t70.a
    public ProactiveMessageJwtDecoder get() {
        return newInstance((n90.c) this.jsonProvider.get());
    }
}
