package ro.sda.webdata.persistence.service.MusicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.sda.webdata.persistence.music.MusicEntity;
import ro.sda.webdata.persistence.music.MusicRepository;

import java.util.List;

@Service
public class MusicService {
    private final MusicRepository musicRepository;

    @Autowired
    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }
    @Transactional
    public void save(String name){
        MusicEntity musicEntity = new MusicEntity();
        musicEntity.setName(name);
        musicRepository.save(musicEntity);
    }
    @Transactional(readOnly = true)
    public List<MusicEntity> findAll(){ return musicRepository.findAll(); }
}
