package org.dimigo.collection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.LinkedList;

public class MelonChartJSONParser {
	
	public static Melon parse(String jsonString){
		Melon melon = new Melon();

        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject root = (JSONObject) jsonParser.parse(jsonString);
            JSONObject jsonObject = (JSONObject) root.get("melon");

            JSONObject songs_root = (JSONObject) jsonObject.get("songs");
            JSONArray songs = (JSONArray)songs_root.get("song");

            System.out.println(songs);

            LinkedList<Song> musics = new LinkedList<>();
            for(Object object : songs)
                musics.add(processSong((JSONObject)object));

            melon.setSongs(musics);

//            melon.setMenuId((Integer)jsonObject.get("menuID"));
//            melon.setCount((Integer)jsonObject.get("count"));
//            melon.setPage((Integer)jsonObject.get("page"));
//            melon.setRankDay((Integer)jsonObject.get("rankDay") + "");


        } catch (ParseException e) {
            e.printStackTrace();
        }


        return melon;
	}

    private static Song processSong(JSONObject song_object) {
        String song_name = (String)song_object.get("songName");

        JSONObject artist_root = (JSONObject)song_object.get("artists");
        JSONArray artist_objects = (JSONArray)artist_root.get("artist");
        LinkedList<Artist> artists = new LinkedList<>();
        for(Object object : artist_objects) {
            JSONObject artist_object = (JSONObject) object;

            long artist_id = (Long)artist_object.get("artistId");
            String artist_name = (String)artist_object.get("artistName");

            Artist artist = new Artist();
            artist.setArtistId((int)artist_id);
            artist.setArtistName(artist_name);

            artists.add(artist);
        }

        Song song = new Song();
        song.setSongName(song_name);
        song.setArtists(artists);


        return song;
    }

}
