package me.degunawan.menampilkanlimainformasi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class InformasikeduaFragment extends Fragment {
    Button moreInfoOnWikipedia, btnDetikDetik;

    public InformasikeduaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_informasikedua, container, false);

        moreInfoOnWikipedia = v.findViewById(R.id.moreInfoOnWikipedia);
        btnDetikDetik = v.findViewById(R.id.btnDetikDetik);

        moreInfoOnWikipedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://id.wikipedia.org/wiki/Indonesia";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }
                else {
                    Toast.makeText(
                            getActivity(),
                            "Gagal membuka situs.",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        btnDetikDetik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/watch?v=ma7lmAjIdqs";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(intent);
                }
                else {
                    Toast.makeText(
                            getActivity(),
                            "Gagal membuka situs.",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });

        return v;

    }

}
