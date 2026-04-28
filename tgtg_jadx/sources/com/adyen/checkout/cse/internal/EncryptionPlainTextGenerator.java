package com.adyen.checkout.cse.internal;

import com.adyen.checkout.cse.EncryptionException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.core.android.internal.DateKtxConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/cse/internal/EncryptionPlainTextGenerator;", "", "()V", "GENERATION_DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "GENERATION_TIME_KEY", "", "generate", "generationTime", "Ljava/util/Date;", "entries", "", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEncryptionPlainTextGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncryptionPlainTextGenerator.kt\ncom/adyen/checkout/cse/internal/EncryptionPlainTextGenerator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n216#2,2:39\n*S KotlinDebug\n*F\n+ 1 EncryptionPlainTextGenerator.kt\ncom/adyen/checkout/cse/internal/EncryptionPlainTextGenerator\n*L\n24#1:39,2\n*E\n"})
public final class EncryptionPlainTextGenerator {

    @NotNull
    private static final SimpleDateFormat GENERATION_DATE_FORMAT;

    @NotNull
    private static final String GENERATION_TIME_KEY = "generationtime";

    @NotNull
    public static final EncryptionPlainTextGenerator INSTANCE = new EncryptionPlainTextGenerator();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateKtxConstants.ISO_8601_UTC_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DateKtxConstants.UTC_TIMEZONE));
        GENERATION_DATE_FORMAT = simpleDateFormat;
    }

    private EncryptionPlainTextGenerator() {
    }

    @NotNull
    public final String generate(@NotNull Date generationTime, @NotNull Map<String, ? extends Object> entries) {
        generationTime.getClass();
        entries.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ? extends Object> entry : entries.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put(GENERATION_TIME_KEY, GENERATION_DATE_FORMAT.format(generationTime));
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (JSONException e5) {
            throw new EncryptionException("Encryption failed.", e5);
        }
    }
}
