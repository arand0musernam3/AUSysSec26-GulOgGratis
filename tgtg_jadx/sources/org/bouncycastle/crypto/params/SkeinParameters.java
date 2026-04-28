package org.bouncycastle.crypto.params;

import b3.i;
import com.braze.h2;
import i4.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Integers;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: loaded from: classes3.dex */
public class SkeinParameters implements CipherParameters {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;
    private Hashtable parameters;

    public SkeinParameters() {
        this(new Hashtable());
    }

    public byte[] getKey() {
        return (byte[]) this.parameters.get(Integers.valueOf(0));
    }

    public byte[] getKeyIdentifier() {
        return (byte[]) this.parameters.get(Integers.valueOf(16));
    }

    public byte[] getNonce() {
        return (byte[]) this.parameters.get(Integers.valueOf(20));
    }

    public Hashtable getParameters() {
        return this.parameters;
    }

    public byte[] getPersonalisation() {
        return (byte[]) this.parameters.get(Integers.valueOf(8));
    }

    public byte[] getPublicKey() {
        return (byte[]) this.parameters.get(Integers.valueOf(12));
    }

    private SkeinParameters(Hashtable hashtable) {
        this.parameters = hashtable;
    }

    public static class Builder {
        private Hashtable parameters = new Hashtable();

        public Builder(SkeinParameters skeinParameters) {
            Enumeration enumerationKeys = skeinParameters.parameters.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.parameters.put(num, skeinParameters.parameters.get(num));
            }
        }

        public SkeinParameters build() {
            return new SkeinParameters(this.parameters);
        }

        public Builder set(int i11, byte[] bArr) {
            String str;
            if (bArr == null) {
                str = "Parameter value must not be null.";
            } else if (i11 != 0 && (i11 < 4 || i11 >= 63 || i11 == 48)) {
                str = "Parameter types must be in the range 0,5..47,49..62.";
            } else {
                if (i11 != 4) {
                    this.parameters.put(Integers.valueOf(i11), bArr);
                    return this;
                }
                str = "Parameter type 4 is reserved for internal use.";
            }
            a.f(str);
            return null;
        }

        public Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public Builder setPersonalisation(Date date, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, ArticleContentView.UTF_8_ENCODING_TYPE);
                outputStreamWriter.write(new SimpleDateFormat("yyyyMMdd").format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                h2.b(i.k("Byte I/O failed: ", e5));
                return null;
            }
        }

        public Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public Builder(Hashtable hashtable) {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.parameters.put(num, hashtable.get(num));
            }
        }

        public Builder() {
        }

        public Builder setPersonalisation(Date date, Locale locale, String str, String str2) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, ArticleContentView.UTF_8_ENCODING_TYPE);
                outputStreamWriter.write(new SimpleDateFormat("yyyyMMdd", locale).format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                h2.b(i.k("Byte I/O failed: ", e5));
                return null;
            }
        }

        public Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }
    }
}
